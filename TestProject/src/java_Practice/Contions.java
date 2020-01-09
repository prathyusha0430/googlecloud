package java_Practice;

import java.util.Scanner;

public class Contions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a n number");
		int N = scanner.nextInt();
	        
	if (N%2==1)
	        {
	            System.out.println("Weird");
	        }      
	    else if(N%2==0  && (N>=2 && N<=5))
	        {
	            System.out.println("Not Weird");
	        }
	    else if (N%2==0 && (N>=6 && N<=20))
	        {
	            System.out.println("Weird");
	        }
	    else if( N%2==0 && N>20)
	        {
	            System.out.println("Not Weird");
	        }
	        scanner.close();

	}

}
