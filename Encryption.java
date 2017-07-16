package GuviProgs;

import java.util.*;

public class Encryption {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1:");
		String str1=sc.nextLine();
		System.out.println("Enter the string 2:");
		String str2=sc.nextLine();
		String encode="";
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			int n=(int)c;
			if(c>=97&&c<=112){
			n+=10;	
			}
			else if(n>112&&n<=122){
				n=n+10-122;
				n+=96;
			}
			encode+=(char)n;
		}
		encode+=" ";
		for(int i=0;i<str2.length();i++){
			char c=str2.charAt(i);
			int n=(int)c;
			if(i!=0&&i!=str2.length()-1)
			{
			if(c>=97&&c<=112){
			n+=10;	
			}
			else if(n>112&&n<=122){
				n=n+10-122;
				n+=96;
			}
			}
			encode+=(char)n;
		}
		System.out.println(encode);
		}
		
	}
