import java.util.*;
import java.io.*;

class test
{
	public static void main(String args[]) throws Exception
	{
		Scanner s=new Scanner(System.in);
		System.setOut(new PrintStream(new FileOutputStream("/Users/sukritisehgal/Documents/home.txt ")));
		int test=s.nextInt();
		
		for(int i=0;i<test;i++)
		{
			int credit=s.nextInt();
			int totalItems=s.nextInt();
			int items[]=new int[totalItems];
			int flag=0;
			
			for(int j=0;j<totalItems;j++)
			{
				items[j]=s.nextInt();
			}
			int j,k=0;
			for(j=0;j<totalItems-1;j++)
			{
				for(k=j+1;k<totalItems;k++)
				{
					if(items[j]+items[k]==credit)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					break;
				}
			}
			if(j<=k)
			{
				System.out.println("Case #"+(i+1)+":"+" "+(j+1)+" "+(k+1));
			}
			else
			{
				System.out.println("Case #"+(i+1)+":"+" "+(k+1)+" "+(j+1));
			}
		}
	}
}
				