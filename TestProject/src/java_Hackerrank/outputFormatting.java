package java_Hackerrank;
import java.util.*;
public class outputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[3];
		String g[] = new String[3];
		
		for (int i=0;i<3;i++)
		{
			System.out.print("Enter int ");
			s[i]=sc.nextInt();
			System.out.print("Enter String ");
			g[i]=sc.next();
		}
		
        System.out.println("================================");
        for(int i=0;i<3;i++){
                    System.out.printf("%-15s%03d%n", g[i], s[i]);
        }
        System.out.println("================================");
sc.close();
	}

}
