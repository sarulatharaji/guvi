package GuviProgs;

import java.util.Scanner;

public class VowelsRem 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.nextLine();
	StringBuffer sb=new StringBuffer(str);
	String str1=sb.reverse().toString();
	char arr[]=str1.toCharArray();
	String res="";
	for(int i=0;i<sb.length();i++)
	{
		if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
		{
			arr[i]='\0';
		}
		else
			res+=arr[i];
	}
	System.out.println(res);
}
}
