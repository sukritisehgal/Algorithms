import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String test=s.next();
		
		char array[]=test.toCharArray();
		
		int store[]=new int[26];
		
		for(int i=0;i<test.length();i++)
		{
			store[array[i]-'a']++;
		}
		int sum=0;
		for(int i=0;i<26;i++)
		{
			if(store[i]%2!=0)
			{
				sum++;
			}
		}
		if(sum>1)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("YES");
		}
	}
}
		