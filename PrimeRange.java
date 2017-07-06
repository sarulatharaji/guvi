package Guvi;
import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int flag=0;
		for(int i=a;i<=b;i++)
		{
			flag=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
				System.out.println(i);
		}
	}

}
