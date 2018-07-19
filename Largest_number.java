import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    boolean compare(int i,int j)
    {
        String s1=Integer.toString(i);
        String s2=Integer.toString(j);
        String s1_dup=s1;
        s1=s1+s2;
        s2=s2+s1_dup;
        //System.out.println(s1);
        //System.out.println(s2);
        
        int res1=Integer.parseInt(s1);
        int res2=Integer.parseInt(s2);
        
        if(res1>res2)
        {
            //System.out.println(res1);
            return true;
        }
        //System.out.println(res2);
        return false; 
    }
    void sort(int[] array, int size)
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(!compare(array[i],array[j]))
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
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
		    GFG obj=new GFG();
		    obj.sort(array,size);
		    String[] str=new String[size];
		    for(int j=0;j<size;j++)
		    {
		        str[j]=Integer.toString(array[j]);
		    }
		    StringBuilder sb=new StringBuilder(str[0]);
		    for(int j=1;j<size;j++)
		    {
		        sb.append(str[j]);
		    }
		    String finalstr=sb.toString();
		    System.out.println(finalstr);
		}
	}
}