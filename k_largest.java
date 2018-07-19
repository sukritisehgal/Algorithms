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
		    int k=s.nextInt();
		    int k_dup=k;
		    int array[][]=new int[size][2];
		    
		    for(int j=0;j<size;j++)
		    {
		        array[j][0]=s.nextInt();
		        array[j][1]=0;
		    }
		    while(k_dup>0)
		    {
		        int max=0;
		        for(int j=0;j<size;j++)
		        {
		            if(array[j][1]==0)
		            {
		                if(array[j][0]>max)
		                {
		                    max=array[j][0];
		                }
		            }
		        }
		        for(int l=0;l<size;l++)
		        {
		            if(array[l][0]==max)
		            {
		                if(array[l][1]==0)
		                {
		                    array[l][1]=1;
		                    break;
		                }
		            }
		        }
		        if(k_dup==k)
		        {
		            System.out.print(max);
		        }
		        else
		        {
		            System.out.print(" " + max);
		        }
		        
		        k_dup--;
		    }
		    System.out.println();
		}
	}
}