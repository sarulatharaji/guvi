package Guvi;
import java.util.*;
public class Pro_lev {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int n=in.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}	
		int mul[]=new int[n];
		for(int i=0;i<n;i++)
		{
			mul[i]=arr[i][0]-1;				
			mul[i]+=((arr[i][1]-1)*arr[i][0]);	
		}
		//returns value
		for(int i=0;i<n;i++)
		{
			System.out.println(mul[i]);
		}
	}

}
