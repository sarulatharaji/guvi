package GuviProgs;
import java.util.*;
public class LongestSubStr 
{
 void longestSubstring(String inputString)
 {
    char[] str1= inputString.toCharArray();    
    String longestSubstring = null;
    int longestSubstringLength = 0; 
   Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
    for (int i = 0; i < str1.length; i++) 
    {
        char ch =str1[i]; 
        if(!map.containsKey(ch))
        {
            map.put(ch, i);
        }
     else
        {    
            i =map.get(ch);
             
           map.clear();
        }
     if(map.size() > longestSubstringLength)
        {
            longestSubstringLength = map.size();
            longestSubstring = map.keySet().toString();
        }
    } 
    System.out.println("Input String : "+inputString);  
    System.out.println("The longest substring : "+longestSubstring);  
}
 
public static void main(String[] args) 
{    
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	LongestSubStr ls=new LongestSubStr();
    ls.longestSubstring(str);     
}
}
