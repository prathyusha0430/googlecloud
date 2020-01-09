package java_Hackerrank;
import java.util.*;
public class endOfFile {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		int i=0;
		   while(scan.hasNext())
		   {
		       i++;
		       System.out.println(i + " " + scan.nextLine());

	       }
scan.close();
	}
}