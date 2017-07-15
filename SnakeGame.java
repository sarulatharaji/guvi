package GuviProgs;
import java.util.*;
public class SnakeGame {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int i,j;
		 for(i=1; i<=size; i++)
		    {
		        for(j=1; j<=size; j++)
		        {
		            if(i==1 || i==size|| j==1 || j==size)
		            {
		                System.out.println("*");
		            }
		            else
		            {
		            	System.out.println(" ");
		            }
		        }
		        System.out.println();
		    }
	}

}
