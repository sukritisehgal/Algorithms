/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int i=0;i<test;i++)
	    {
	        int query = s.nextInt();
	        for(int j=0;j<query;j++)
	        {
	            long l = s.nextLong();
	            long r = s.nextLong();
	            int d = Math.abs((int)(l-r));
	            int totalcount=0;

	            for(int k=0;k<=d;k++)
	            {
	                String str=Long.toBinaryString(l);
	                if(l<r)
	                {
	                    l++;
	                }
	                else
	                {
	                    l--;
	                }
	                int count=0;
	                char[] chararray = str.toCharArray();
	                for(int n=0;n<str.length();n++)
	                {
	                    if(chararray[n]=='1')
	                    {
	                        count++;
	                    }
	                }
	                if(count<=3)
	                {
	                    totalcount++;
	                }
	           }
	           System.out.println(totalcount);
	        }
	    }
		//code
	}
}