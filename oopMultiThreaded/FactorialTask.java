package oopMultiThreaded;

import java.math.BigInteger;


public class FactorialTask implements Runnable {
  private int number;
  private BigInteger result = BigInteger.ZERO;

  public FactorialTask(int number) {
    super();
    this.number = number;
  }

  public BigInteger getResult() {
    return result;
  }

  public BigInteger factorialCalculate(int n) {
    BigInteger fact = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      fact = fact.multiply(BigInteger.valueOf(i));
    }
    return fact;
  }
  
  public void factorailstream (int number) {
	  for (int i = 1; i <= number; i++) {
		  FactorialTask fact1 = new FactorialTask(i);
		  Thread td1 = new Thread(fact1);
		  td1.start();
	  }
  }

  @Override
  public void run() {
    Thread thr = Thread.currentThread();
    for (int i = 0; i <= number; i++) {
      BigInteger fact = factorialCalculate(i);
      System.out.println(thr.getName() + " -> " + i + "! = " + fact);
      result = result.add(fact);
    }

  }

}

