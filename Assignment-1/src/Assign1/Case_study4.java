package Assign1;

import java.util.Scanner;

public class Case_study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        // nextDouble() 
		        System.out.print("Enter a double value: ");
		        if (sc.hasNextDouble()) {
		            double doubleValue = sc.nextDouble();
		            System.out.println("Value is: " + doubleValue);
		        } else {
		            System.out.println("That's not a valid double!");
		          
		        }

		        // nextBoolean()
		        System.out.print("Enter boolean value ");
		        if (sc.hasNextBoolean()) {
		            boolean booleanValue = sc.nextBoolean();
		            System.out.println("Value is: " + booleanValue);
		        } else {
		            System.out.println("That's not a valid boolean!");
		           sc.next();
		        }

		        // hasNext()
		        System.out.print("Enter any value: ");
		        if (sc.hasNext()) {
		            String anyValue = sc.next();
		            System.out.println("value is " + anyValue);
		        }

		        // hasNextInt() 
		        System.out.print("Enter an integer value: ");
		        if (sc.hasNextInt()) {
		            int intValue = sc.nextInt();
		            System.out.println("value is" + intValue);
		        } else {
		            System.out.println("That's not a valid integer!");
		      
		        }

		        // hasNextLine() example
		        System.out.print("Enter a line of text: ");
		        sc.nextLine(); 
		        if (sc.hasNextLine()) {
		            String line = sc.nextLine();
		            System.out.println("value is " + line);
		        }

	}

}
