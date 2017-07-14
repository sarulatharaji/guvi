package GuviProgs;
import java.util.*;
public class Currency {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	int count=0;
	//read the amount
	int amount=sc.nextInt();
	//rupess in array
	int[] money= {1,10,50,100,500};
	int n=money.length;
	int[] cal=new int[money.length];
	//calculating rupees for the amount
	for(int i=n-1;i>=0;i--)
	{
		cal[i]=amount/money[i];
		amount=amount%money[i];
	}
	//counting the rupees
	for(int i=0;i<n;i++)
	{
		count=count+cal[i];
	}
	System.out.println(count);
	}

}
