package GuviProgs;
import java.util.*;

public class MailValidator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String mail=sc.next();
		String com=".com";
		if(mail.contains("@")&&mail.contains("."))
		{
			if(mail.indexOf("@")==mail.indexOf("@"))
			{
				if(mail.indexOf(".")==mail.lastIndexOf("."))
					{
					if((mail.indexOf(".")-mail.indexOf("@")-1>4)&&mail.indexOf("@")>3&&mail.endsWith(com))
					{
						System.out.println("valid");
					}
					}
			}
			}
		 else
				System.out.println("Not valid");
	}
}

		