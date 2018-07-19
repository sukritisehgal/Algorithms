import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int coloumn=s.nextInt();
		char array[][]=new char[row][coloumn];
		//Reader r=new InputStreamReader(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				array[i][j]=s.next().charAt(0);
			}
		}
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				if(array[i][j]=='#')
				{
					count++;
				}
			}
		}
		if(count%2!=0)
		{
			System.out.println("NO");
		}
		else
		{
			if(row%2!=0 && coloumn%2!=0)
			{
				System.out.println("NO");
			}
			if(row%2==0 && coloumn%2!=0)
			{
				int half=row/2;
				int count1=0;
				for(int i=0;i<half;i++)
				{
					for(int j=0;j<coloumn;j++)
					{
						if(array[i][j]=='#')
						{
							count1++;
						}
					}
				}
				int count2=0;
				for(int i=half;i<row;i++)
				{
					for(int j=0;j<coloumn;j++)
					{
						if(array[i][j]=='#')
						{
							count2++;
						}
					}
				}
				if(count1==count2)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			if(row%2!=0 && coloumn%2==0)
			{
				int half=coloumn/2;
				int count1=0;
				for(int i=0;i<half;i++)
				{
					for(int j=0;j<row;j++)
					{
						if(array[j][i]=='#')
						{
							count1++;
						}
					}
				}
				int count2=0;
				for(int i=half;i<coloumn;i++)
				{
					for(int j=0;j<row;j++)
					{
						if(array[j][i]=='#')
						{
							count2++;
						}
					}
				}
				if(count1==count2)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
			if(row%2==0 && coloumn%2==0)
			{
			    int half1=row/2;
			    int half2=coloumn/2;
			    int count1=0;
			    int count2=0;
			    int flag=0;
			    for(int i=0;i<half1;i++)
			    {
			        for(int j=0;j<coloumn;j++)
			        {
			            if(array[i][j]=='#')
			            {
			                count1++;
			            }
			        }
			    }
			    for(int i=half1;i<row;i++)
			    {
			        for(int j=0;j<coloumn;j++)
			        {
			            if(array[i][j]=='#')
			            {
			                count2++;
			            }
			        }
			    }
			    if(count1==count2)
			    {
			        flag=1;
			        System.out.println("YES");
			    }
			    if(flag==0)
			    {
			        count1=0;
			        count2=0;
			        for(int i=0;i<half2;i++)
			        {
			            for(int j=0;j<row;j++)
			            {
			                if(array[j][i]=='#')
			                {
			                    count1++;
			                }
			            }
			        }
			        for(int i=half2;i<coloumn;i++)
			        {
			            for(int j=0;j<row;j++)
			            {
			                if(array[j][i]=='#')
			                {
			                    count2++;
			                }
			            }
			        }
			        if(count1==count2)
			        {
			            System.out.println("YES");
			        }
			        else{
			            System.out.println("NO");
			        }
			    }
			}
		}
	}
}