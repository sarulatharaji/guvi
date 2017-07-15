package GuviProgs;
import java.util.*;
public class GeneAndSpecies {

	public static void main(String[] args) {
	Map<String,String> genes=new TreeMap<String,String>();
	Scanner sc=new Scanner(System.in);
	//size of array
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	//reading inputs from user
	for(int i=0;i<n;i++)
	{
		genes.put(sc.next(),sc.next());
	}
	//entering the species to check
	System.out.println("Enter the species to search");
	String search=sc.next();
	if(genes.containsKey(search))
	{
		System.out.println(genes.get(search));
	}
	else
	{
		System.out.println("The genes doesn't match the input");
	}
	}

}
