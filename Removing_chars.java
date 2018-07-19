import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    int position(StringBuilder sb,char c)
    {
        String s=sb.toString();
        char array[]=s.toCharArray();
        int i=0;
        
        for(i=0;i<s.length();i++)
        {
            if(array[i]==c)
            {
                break;
            }
        }
        return i;
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int test=s.nextInt();
		
		for(int i=0;i<test;i++)
		{
		    String s1=s.next();
		    String s2=s.next();
		    int l1=s1.length();
		    int l2=s2.length();
		    char string1[]=s1.toCharArray();
		    char string2[]=s2.toCharArray();
		    StringBuilder sb=new StringBuilder(s1);
		    StringBuilder sb2=new StringBuilder(s2);
		    
		    //Removing duplicates from second string
		    for(int j=0;j<l2-1;j++)
		    {
		        for(int k=j+1;k<l2;k++)
		        {
		            if(string2[j]==string2[k])
		            {
		                sb2.deleteCharAt(k);
		                l2--;
		            }
		        }
		    }
		    s2=sb2.toString();
		    string2=s2.toCharArray();
		    //System.out.println(s2);
		    //System.out.println(l2);
		    
		    for(int j=0;j<l2;j++)
		    {
		        int count=0;
		        for(int k=0;k<l1;k++)
		        {
		            if(string2[j]==string1[k])
		            {
		                GFG obj=new GFG();
		                int pos=obj.position(sb,string1[k]);
		                sb.deleteCharAt(pos);
		            }
		        }
		    }
		    s1=sb.toString();
		    System.out.println(s1);
		}
	}
}