package GuviProgs;
import java.util.*;
public class CountNoOLoop {
	static int count=0;
	public static int noLoop(int num) {
		if (num> 0) {
			if(num%10==7) 
			{
				count++;
			}
			num/=10;
			noLoop(num);
		}
		return count;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(noLoop(n));
	sc.close();
	}

}
