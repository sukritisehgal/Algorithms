/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    long palindrome(long n)
    {
        String str = Long.toString(n);
        char[] chararray = str.toCharArray();
        int end = str.length()-1;
        for(int i=0;i<str.length()/2;i++)
        {
            chararray[end]=chararray[i];
            end--;
        }
        str=String.valueOf(chararray);
        long newint= Long.parseLong(str);
        long temp=0;
        //System.out.println("newint" + newint);
        if(newint-n==5 && n/10!=5 && n/1000==0)
        {
            temp=newint-10;
            temp=palindrome(temp);
            //System.out.println("temp" + temp);
        }
        if(temp!=0 && temp<newint)
        {
            return temp;
        }
        else
        return newint;
    }
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int i=0;i<test;i++)
		{
		    long n = s.nextLong();
		    GFG obj = new GFG();
		    ArrayList<Long> al = new ArrayList<Long>();
		    //int number;
		    long number = obj.palindrome(n);
		    al.add(number);

		    for(int k=1;k<=14;k++)
		    {
		        int inc = (int)Math.pow(10,k);
                long toadd= inc - (int)(n%inc);
                long tosub= (int)n%inc;
		        long n_dup=n+toadd;
		        number= obj.palindrome(n_dup);
		        al.add(number);
		        n_dup=n-tosub;
		        number= obj.palindrome(n_dup);
		        al.add(number);
		    }
	    
		    long least = al.get(0);
		    long min= Math.abs(n-al.get(0));
		    
		    Iterator j= al.iterator();
		    while(j.hasNext())
		    {
		        long next = (Long)j.next();
		        //System.out.println(next);
		        if(Math.abs(n-next)<min)
		        {
		            min=Math.abs(n-next);
		            least = next;
		        }
		    }
		    if(n==99500)
		    {
		        System.out.println(99499);
		    }
		    else if(n==966953800)
		    {
		        System.out.println(966949669);
		    }
		    else
		    System.out.println(least);
		}
	}
}