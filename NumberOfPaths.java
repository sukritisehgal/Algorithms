import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    int numberOfPaths(int m, int n)
    {
        if(m==1||n==1)
        {
            return 1;
        }
        return numberOfPaths(m-1,n)+numberOfPaths(m,n-1);
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++)
		{
		    int rows=s.nextInt();
		    int coloumns=s.nextInt();
		   
		    GFG obj=new GFG();
		    int sol=obj.numberOfPaths(rows,coloumns);
		    System.out.println(sol);
		}
	}
}