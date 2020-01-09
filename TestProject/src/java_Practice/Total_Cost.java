package java_Practice;
import java.util.*;
public class Total_Cost {

	
	  static void solve(double meal_cost, int tip_percent, int tax_percent) {
	        double t = (meal_cost * tip_percent )/100;
	        double h = (meal_cost * tax_percent )/100;
	        double k = meal_cost + t +h ;
	        System.out.println(Math.round(k));

      
	    }
	
		
	public static void main(String[] args)
	{
  	  

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter   Meal_Cost  ");
		     double meal_cost = scanner.nextDouble();
		     
		     System.out.println("Enter tip percent ");
		        int tip_percent = scanner.nextInt();
		        
		        System.out.println("Enter tax percent ");
		        int tax_percent = scanner.nextInt();
		       
		        solve(meal_cost, tip_percent, tax_percent);

		        scanner.close();
	}

}
