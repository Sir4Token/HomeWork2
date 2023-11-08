package oopMultiThreaded;

public class Main {
	public static void main(String [] args) {
		
		 Thread[] td1 = new Thread[100];
	        for (int i = 0; i < td1.length; i++) {
	        	td1[i] = new Thread(new FactorialTask(i));
	        }
		
	        for (int i = 0; i < td1.length; i++){
	        	td1[i].start();
	            try{
	            	td1[i].join();
	            }catch (InterruptedException e) {   
	            }
	        }
	}
}


