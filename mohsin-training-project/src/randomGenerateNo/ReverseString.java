
package randomGenerateNo;
import java.util.Scanner;
public class ReverseString {
    
    public static void reverse(){
		String s="java html css";
		String result="";
		String[] ar=s.split(" ");
		for(int i=0; i<ar.length; i++)
		{
			/*result=args[0]+" "+result;
			result=args[1]+" "+result;
			result=args[2]+" "+result;
			*/
			result=ar[i]+" "+result;
		}
		String output=result.trim();
		System.out.println(output);
		}
		
		// another method
		public static String reverse(String s)
		{
		String str="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			str=ch+str;
		}
		return str;
		

		}

	}
    


