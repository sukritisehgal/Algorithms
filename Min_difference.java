import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		
		for(int i=0;i<test;i++)
		{
		    int length=s.nextInt();
		    int array[]=new int[length];
		    int min=Integer.MAX_VALUE;
		    
		    for(int j=0;j<length;j++)
		    {
		        array[j]=s.nextInt();
		    }
		    
		    for(int j=0;j<length-1;j++)
		    {
		        for(int k=j+1;k<length;k++)
		        {
		            int value=Math.abs(array[j]-array[k]);
		            //System.out.println(value);
		            if(value<min)
		            {
		                min=value;
		            }
		        }
		    }
		    System.out.println(min);
		}
	}
}