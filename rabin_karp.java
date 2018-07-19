import java.util.*;
class test
{
	void rabin_karp(String text1, String pattern1)
	{
		int m=pattern1.length();
		int n=text1.length();
		int p=0,t=0;
		int h=1;
		char[] pattern=pattern1.toCharArray();
		char[] text=text1.toCharArray();
		
		int d=256; //ASCII
		int q=101; //PRIME NUMBER
		
		for(int i=0;i<m-1;i++)
		{
			h=(h*d)%q;
		}
		for(int i=0;i<m;i++)
		{
			p=(p*d+pattern[i])%q;
			t=(t*d+text[i])%q;
			//System.out.println(p + "\t" + t);
		}
		for(int i=0;i<=n-m;i++)
		{
			if(p==t)
			{
				System.out.println("Match");
				int j;
				for(j=0;j<m;j++)
				{
					if(pattern1.charAt(j)!=text1.charAt(i+j))
					{
						System.out.println(pattern1.charAt(j));
						break;
					}
					//System.out.print(j);
				}
				if(j==m)
				{
					System.out.println("Pattern found at index " + i);
				}
			}
			if(i<n-m)
			{
				t=(d*(t-text[i]*h) + text[i+m])%q;
				if(t<0)
				{
					t=t+q;
				}
			}
		}
	}	
						
			
	public static void main(String dfgrr[])
	{
		Scanner s=new Scanner(System.in);
		String text=s.next();
		String pattern=s.next();
		test obj=new test();
		obj.rabin_karp(text,pattern);
	}
}