package Guvi;
import java.util.*;
public class ReversingWords {

	public static void ReversedWords(String str)
	{
		String[] words=str.split(" ");
		StringBuffer reversed=new StringBuffer();
		
		for(int i=0;i<words.length;i++)
		{
		reversed=reversed.append(new StringBuffer(words[i]).reverse().toString()+" ");
		}
		System.out.println(reversed);
	} 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		ReversedWords(str);
	}

}
