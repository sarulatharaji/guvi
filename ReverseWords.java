package Guvi;

import java.util.Scanner;

public class ReverseWords {

	public static void ReverseWords(String str)
	{
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ReverseWords(str);
	
	}

}
