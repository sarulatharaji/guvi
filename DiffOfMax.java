package GuviProgs;
import java.util.*;

public class DiffOfMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Enter array size
		int n=sc.nextInt();
		int[] arr=new int[n];
		//get array elements
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=-9999;
		int dif=0;
		//finding element of max diff
		for(int i=0;i<n-1;i++)
		{
			dif=arr[i]-arr[i+1];
			if(dif>max)
				max=dif;
		}
		System.out.println(max);
	}

}
