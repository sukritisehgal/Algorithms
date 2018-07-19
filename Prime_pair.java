import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    boolean isPrime(int n)
    {
        int factors=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factors++;
            }
        }
        if(factors==2)
        {
            //System.out.println(n + "is prime");
            return true;
        }
        else
        {
           // System.out.println(n + "is not prime");
            return false;
        }
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		
		for(int i=0;i<test;i++)
		{
		    int number=s.nextInt();
		    int no_pairs=0;
		    
		    GFG obj=new GFG();
		    //obj.isPrime(4);
		    
		    for(int j=2;j<=number/2;j++)
		    {
		        if(obj.isPrime(j))
		        {
		            for(int k=2;j*k<=number;k++)
		            {
		                if(obj.isPrime(k))
		                {
		                    if(j==2 && k==2)
		                    {
		                        System.out.print(j + " " + k);
		                    }
		                    else
		                    {
		                        System.out.print(" " + j + " " + k);
		                    }
		                }
		            }
		        }
		    }
		    System.out.println();
		}
	}
}