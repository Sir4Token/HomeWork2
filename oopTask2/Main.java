package oopTask2;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Print Size1: ");
		int size1 = sc.nextInt();
		
		System.out.print("Print Size2: ");
		int size2 = sc.nextInt();
		
		System.out.print("Print Size3: ");
		int size3 = sc.nextInt();
		
		Triangle forma1 = new Triangle(size1, size2, size3);
		
		
		
		System.out.println(forma1);
		System.out.println("Area of the triangle " + forma1.areaGeron());
	
	}

	
	
	
	
	

	
	
	
	
	

}
