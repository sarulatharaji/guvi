package GuviProgs;
import java.util.*;
public class RemoveNum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//Enter array size
		int n=sc.nextInt();
		int[] arr=new int[n];
		//get array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//enter the element to be removed
		int rem=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=rem)
			{
				System.out.println(arr[i]+" ");
			}
		}

	}

}
