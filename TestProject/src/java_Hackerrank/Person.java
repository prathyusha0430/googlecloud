package java_Hackerrank;
import java.util.*;
public class Person {

	int age=0;
	
	
	public Person(int initialAge) {
  		  age = initialAge;
          if (age < 0)
          {
              age =0;
              System.out.println("Age is not valid, setting age to 0.");

          }

	}

	public void amIOld() {
  		  if (age < 13)

        System.out.println("You are young.");
        else if (age >= 13 && age < 18)
         System.out.println("You are a teenager.");
         else
          System.out.println("You are old.");
	}

	public void yearPasses() {
  	age=age+1;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to test no of times");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++)
		{
			System.out.println("Enter age");
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++)
			{
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

	}


