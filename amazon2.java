import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    array[i]=s.nextInt();
		}
		for(int i=0;i<size-2;i++)
		{
		    int n=i+3;
		    int max=array[i];
		    for(int j=i+1;j<n;j++)
		    {
		        if(array[j]>max)
		        {
		            max=array[j];
		        }
		    }
		    System.out.println(max);
		}
	}
}