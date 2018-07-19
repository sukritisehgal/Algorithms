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
		    int rows=s.nextInt();
		    int coloumns=s.nextInt();
		    int array[][]=new int[rows][coloumns];
		    
		    for(int j=0;j<rows;j++)
		    {
		        for(int k=0;k<coloumns;k++)
		        {
		            array[j][k]=s.nextInt();
		        }
		    }
		    for(int j=0;j<rows;j++)
		    {
		        for(int k=0;k<coloumns;k++)
		        {
		            if(array[j][k]==1)
		            {
		                for(int l=0;l<coloumns;l++)
		                {
		                    if(array[j][l]==0)
		                    {
		                        array[j][l]=2;
		                    }
		                }
		                for(int l=0;l<rows;l++)
		                {
		                    if(array[l][k]==0)
		                    {
		                        array[l][k]=2;
		                    }
		                }
		            }
		        }
		    }
		    for(int j=0;j<rows;j++)
		    {
		        for(int k=0;k<coloumns;k++)
		        {
		            if(array[j][k]==2)
		            {
		                array[j][k]=1;
		            }
		        }
		    }
		    for(int j=0;j<rows;j++)
		    {
		        for(int k=0;k<coloumns;k++)
		        {
		            if(j==0 && k==0)
		            {
		                System.out.print(array[j][k]);
		            }
		            else
		            {
		                System.out.print(" " + array[j][k]);
		            }
		        }
		    }
		    System.out.println();
		}
	}
}