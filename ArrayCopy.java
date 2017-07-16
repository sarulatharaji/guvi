package GuviProgs;

import java.util.*;

public class ArrayCopy {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<n;i++)
		{
			flag=0;
			for(int j=0;j<n-1;j++)
			{
			if(i!=j)
			{
			if(arr[i]==arr[j])
			{
					flag=1;
			}
			}
			}
			if(flag==0)
			{
			System.out.println(arr[i]);
			}
		}
		}
}
