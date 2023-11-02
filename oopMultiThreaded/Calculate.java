package oopMultiThreaded;

import java.util.Random;

public class Calculate {
	
	public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static long calculateSumSingleThread(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static long calculateSumMultiThread(int[] array) {
        int numThreads = Runtime.getRuntime().availableProcessors(); 
        long[] partialSums = new long[numThreads];
        Thread[] threads = new Thread[numThreads];
        int chunkSize = array.length / numThreads;
        
        for (int i = 0; i < numThreads; i++) {
            final int threadId = i;
            threads[i] = new Thread(() -> {
                long partialSum = 0;
                int start = threadId * chunkSize;
                int end = (threadId == numThreads - 1) ? array.length : start + chunkSize;
                for (int j = start; j < end; j++) {
                    partialSum += array[j];
                }
                partialSums[threadId] = partialSum;
            });
            threads[i].start();
        }
        
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = 0;
        for (long partialSum : partialSums) {
            totalSum += partialSum;
        }
        
        return totalSum;
    }
	
	
	
}