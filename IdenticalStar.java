package GuviProgs;

import java.util.*;

public class IdenticalStar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length()-1;i++)
		{
			char copy=str.charAt(i);
			if(str.charAt(i+1)==copy){
				String a=str.substring(0,i+1);
				String b=str.substring(i+1);
				str=a+'*'+b;
			}
		}
		System.out.println(str);
		sc.close();
	}

}
