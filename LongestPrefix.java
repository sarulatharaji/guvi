package GuviProgs;
import java.util.*;
public class LongestPrefix 
{
	public static String commonPrefix(String a, String b) {
	    int minLength=Math.min(a.length(), b.length());
	    for(int i=0;i< minLength;i++) {
	        if(a.charAt(i)!=b.charAt(i)) 
	        {
	            return a.substring(0,i);
	        }
	    }
	    return a.substring(0, minLength);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=new String[2];
		for(int i=0;i<2;i++)
		{
			str[i]=sc.nextLine();
		}
		String str1=str[0];
		String str2=str[1];
		System.out.println(commonPrefix(str1,str2));
	}
	
	
}
