package java_Practice;

import java.util.*;
public class Data_Types {
	

	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int f = scan.nextInt();
	        
	        System.out.print("Enter an double: ");
	        double  d1 = scan.nextDouble();
	        System.out.print("Enter String  ");
	       
	        String s1 = scan.next(); 
	        System.out.println(i+f);
	        System.out.println(d1+d);
	        System.out.println(s + "" + s1);
	    	
	        
	       	        scan.close();
	    }
}
