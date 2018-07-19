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
		    int array[][]=new int[length][2];
		    int pos=0,flag;
		    for(int j=0;j<length;j++)
		    {
		    	array[j][1]=0;
		    }
		    
		    for(int j=0;j<length;j++)
		    {
		        flag=0;
		        int x=s.nextInt();
		        //System.out.println(j);
		        for(int k=0;k<pos;k++)
		        {
		            if(array[k][0]==x)
		            {
		                array[k][1]+=1;
		                flag=1;
		                //System.out.println("Element present");
		            }
		        }
		        if(flag==0)
		        {
		            array[pos][0]=x;
		            array[pos][1]+=1;
		            pos++;
		            //System.out.println("Element entered"); 
		        }
		    }
		    for(int j=0;j<pos;j++)
		    {
		        if(array[j][1]%2==1)
		        {
		            System.out.println(array[j][0]);
		        }
		    }
		}
	}
}