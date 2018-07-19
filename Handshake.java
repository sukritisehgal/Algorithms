import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    int handshakes(int n)
    {
        int no_hand=0;
        if(n==0)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        else
        {
            for(int i=0;i<n;i=i+2)
            {
                no_hand+=handshakes(i)*handshakes(n-i-2);
            }
            return no_hand;
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
		    
		    int res=obj.handshakes(number);
		    System.out.println(res);
		}
	}
}