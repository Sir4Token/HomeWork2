package oopMultiThreaded;

public class Main2 {
    public static void main(String[] args) {
    	Calculate calculate = new Calculate();
        int[] array = calculate.generateRandomArray(100000000);
        
        long startTime = System.nanoTime();
        long singleThreadSum = calculate.calculateSumSingleThread(array);
        long endTime = System.nanoTime();
        long singleThreadTime = endTime - startTime;

        System.out.println("Однопотоковий підрахунок: " + singleThreadSum);
        System.out.println("Час виконання однопотокового підрахунку: " + singleThreadTime + " нс");

        startTime = System.nanoTime();
        long multiThreadSum = calculate.calculateSumMultiThread(array);
        endTime = System.nanoTime();
        long multiThreadTime = endTime - startTime;

        System.out.println("Багатопотоковий підрахунок: " + multiThreadSum);
        System.out.println("Час виконання багатопотокового підрахунку: " + multiThreadTime + " нс");
    }

    
}

