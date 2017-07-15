package GuviProgs;
import java.util.*;
public class KinderGarten
{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count = 0;
			int uPair = 1;
			int pair;
			for(int i=0; i<2*n;i++) 
			{
				 pair=2*n-i;
				if(n!=pair) 
				{
					System.out.print(uPair+" ");
					uPair++;
					count++;
				}
			}
			System.out.println("\nUnique pairs are:"+count);
	}

}

