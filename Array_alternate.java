import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    void rightrotate(int[] array, int outOfPlace, int index)
    {
        int temp=array[index];
        for(int i=index;i>outOfPlace;i--)
        {
            array[i]=array[i-1];
        }
        array[outOfPlace]=temp;
    }
    void rearrange(int[] array,int size)
    {
        int outOfPlace=-1;
        
        for(int index=0;index<size;index++)
        {
            if(outOfPlace>=0)
            {
                if((array[index]>=0 && array[outOfPlace]<0) || (array[index]<0 && array[outOfPlace]>=0))
                {
                    rightrotate(array,outOfPlace,index);
                    
                    if(index-outOfPlace>2)
                    {
                        outOfPlace+=2;
                    }
                    else
                    {
                        outOfPlace=-1;
                    }
                }
            }
            if(outOfPlace==-1)
            {
                if((array[index]>=0 && index%2==1) || (array[index]<0 && index%2==0))
                {
                    outOfPlace=index;
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
		    obj.rearrange(array,size);
		    
		    for(int j=0;j<size;j++)
		    {
		        if(j==0)
		        {
		            System.out.print(array[j]);
		        }
		        else
		        {
		            System.out.print(" "+ array[j]);
		        }
		    }
		    System.out.println();
		}
	}
}