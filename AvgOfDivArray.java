package GuviProgs;

import java.util.*;

public class AvgOfDivArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//enter array size
		int n=sc.nextInt();
		int arr[]=new int[n];
		//read array inputs
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int len=n/2;
		int sum=0;
		int sum1=0;
		float avg=0;
		float avg1=0;
		int count=0;
		int count1=0;
		//finding sum of first half array
		for(int i=0;i<len&&arr[i]>0;i++)
		{
			sum=sum+arr[i];
			  count++;
		}
		//finding sum of remaining half array
		for(int i=len;i<n&&arr[i]>0;i++)
		{
			sum1=sum1+arr[i];
			  count1++;
		}
		avg=sum/count;
		avg1=sum1/count1;
		if(avg==avg1)
		{
			System.out.println("Both averages are same");
		}
		else
		{
			System.out.println("Both averages are not same");
		}

	}

}
