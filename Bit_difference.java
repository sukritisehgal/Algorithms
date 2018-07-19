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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int bits=0;
		    
		    int res=(int)a^b;
		    
		    String result=Integer.toBinaryString(res);
		    //System.out.println(result);
		    
		    char array[]=result.toCharArray();
		    
		    for(int j=0;j<result.length();j++)
		    {
		        //System.out.println(array[j]);
		        if(array[j]=='1')
		        {
		            bits++;
		        }
		    }
		        
		    System.out.println(bits);
		    
		}
	}
}