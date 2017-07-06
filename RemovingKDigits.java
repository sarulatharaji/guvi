import java.util.*;
public class RemovingKDigits
{
public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int[] arr=new int[num];
//input for arrs
	for(int i=0;i<num;i++)
        {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);

     System.out.println("Enter the k digit");
     int del=sc.nextInt();
//after deleting sorted remaining elements
	for(int i=0;i<num-del;i++)
        {
		System.out.println(arr[i]);
	}
	

	}

}