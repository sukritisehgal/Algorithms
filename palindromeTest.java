/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		char[] strArray = str.toCharArray();
		boolean flag;
		boolean odd;
		boolean even;
		
		flag = GFG.palindrometest(str);
		if(flag==true)
		{
		    System.out.println("PARENT Palindrome");
		}
		else{
		    String oddstring = "";
		    String evenstring ="";
		    StringBuffer oddsb=new StringBuffer(oddstring);
		    StringBuffer evensb = new StringBuffer(evenstring);
		    
		    for(int i=0;i<str.length();i=i+2)
		    {
		        oddsb.append(strArray[i]);
		    }
		    oddstring = oddsb.toString();
		    for(int i=1;i<str.length();i=i+2)
		    {
		        evensb.append(strArray[i]);
		    }
		    evenstring = evensb.toString();
		    
		    odd= GFG.palindrometest(oddstring);
		    even=GFG.palindrometest(evenstring);
		    
		    if(odd== true && even==true)
		    {
		        System.out.println("TWIN Palindrome");
		    }
		    else if(odd==false && even==true)
		    {
		        System.out.println("EVEN Palindrome");
		    }
		    else if(odd==true && even==false)
		    {
		        System.out.println("ODD Palindrome");
		    }
		    else{
		        System.out.println("Alien palindrome");
		    }
		}
		
	}
	public static boolean palindrometest(String str)
	{
	    int last= str.length()-1;
	    char[] strArray = str.toCharArray();
	    int flag=0;
		
		for(int i=0;i<str.length()/2;i++)
		{
		    if(strArray[i]!=strArray[last])
		    {
		        flag=1;
		        break;
		    }
		    last--;
		}
		if(flag==0)
		{
		    return true;
		}
		return false;
	}
}