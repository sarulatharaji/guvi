package Guvi;
import java.util.*;
public class sample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 	int num=sc.nextInt();
		 	int sum=0,rem=0;
		 	while(num!=0)
		 	{
		 		rem=num%10;
		 		sum=(sum)+rem;
		 		num/=10;
		 	}
		 	
		 	int sum1=0,tem=sum;
		 	while(tem!=0)
		 	{
		 		rem=tem%10;
		 		sum1=(sum1)+rem;
		 		tem/=10;
		 	}
		 	
		  if(sum==sum1)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   

	}

}
