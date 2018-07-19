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
		    int size=s.nextInt();
		    int array[]=new int[size];
		    
		    for(int j=0;j<size;j++)
		    {
		        array[j]=s.nextInt();
		    }
		    int incl=array[0];
		    int excl=0;
		    for(int j=1;j<size;j++)
		    {
		        int incl_dup=incl;
		        incl=excl+array[j];
		        excl=Math.max(incl_dup,excl);
		    }
		    int max=Math.max(incl,excl);
		    System.out.println(max);
		}
	}
}