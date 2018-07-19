/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int n= s.nextInt();
		    int[] array = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        array[j]=s.nextInt();
		    }
		    for(int j=0;j<n-1;j++)
		    {
		        if(array[j+1]>0)
		        {
		            if(array[j]==array[j+1])
		            {
		                array[j]*=2;
		                array[j+1]=0;
		                //System.out.println("bits set  : " + array[j]);
		            }
		        }
		    }
		    int count=0;
		    for(int j=0;j<n;j++)
		    {
		        if(array[j]!=0)
		        {
		            array[count++]=array[j];
		        }
		    }
		    while(count<n)
		    {
		        array[count]=0;
		        count++;
		    }
		    if(i==0)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(j==0)
		            {
		                System.out.print(array[j]);
		            }
		            else
		            {
		                System.out.print(" " + array[j]);
		            }
		        }
		    }
		    else
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(j==0)
		            {
		                System.out.println();
		                System.out.print(array[j]);
		            }
		            else
		            {
		                System.out.print(" " + array[j]);
		            }
		        }
		    }
		}
	}
}