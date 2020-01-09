package java_Hackerrank;
import java.util.*;

public class seriesPrinting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of queries ");
        int t=in.nextInt();
        for(int l=0;l<t;l++){
        	System.out.println("Enter 3 numbers ");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x =0;
             for(int j=0,k=0;j<n && k<=n-1;j++,k++){
            x=(int)Math.pow(2,k)*b + x;
             System.out.print(a+x+" ");
             }
             System.out.println("");
        }
        in.close();
	}

}
