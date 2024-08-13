package Assign1;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		double n = sc.nextDouble();
        
        double i = Math.abs(n);
		System.out.println("Absolute value is :"+i);
	}

}
