/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int n= s.nextInt();
		    String str= Integer.toBinaryString(n);
		    char[] array = str.toCharArray();
		    
		    
		    int[] garray = new int[str.length()];
		    for(int j=1;j<str.length();j++)
		    {
		        int a= Integer.parseInt(String.valueOf(array[j-1]));
		        int b= Integer.parseInt(String.valueOf(array[j]));
		        garray[j]=(a^b);
		    }
            garray[0]=Integer.parseInt(String.valueOf(array[0]));
            
		    String st="";
		    for(int m=0;m<str.length();m++)
		    {
		        st+=Integer.toString(garray[m]);
		    }
		    int finalint=Integer.parseInt(st,2);
		    System.out.println(finalint);
		}
	}
}