import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    int count(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
        else
        {
            return count(n-1)+count(n-2);
        }
    }
    
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		
		for(int i=0;i<test;i++)
		{
		    int number=s.nextInt();
		    
		    GFG obj=new GFG();
		    
		    int n=obj.count(number);
		    
		    System.out.println(n);
		}
	}
}