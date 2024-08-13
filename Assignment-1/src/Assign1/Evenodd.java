package Assign1;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		if(a%2==0)
			System.out.println(a+" is even");
		else
			System.out.println(a+" is odd");
		
		
}


}
