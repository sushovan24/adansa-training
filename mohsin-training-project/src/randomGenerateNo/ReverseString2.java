
package randomGenerateNo;
import java.util.Scanner;
public class ReverseString2 {
   
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the string");
		String s=scan.nextLine();	
		String result="";
		String[] ar=s.split(" ");
		for(int i=0; i<ar.length; i++)
		{
			
			result=reverse(ar[i])+" "+result;
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

    

