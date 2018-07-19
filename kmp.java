import java.util.*;
class test
{
	int[] computeLPS(String pattern,int m, int[] lps)
	{
		int i=1,len=0;
		lps[0]=0;
		
		while(i<m)
		{
			if(pattern.charAt(i)==pattern.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
			}
			else
			{
				if(len!=0)
				{
					len=lps[len-1];
				}
				else
				{
					lps[i]=len;
					i++;
				}
			}
		}

		return lps;
	}
	
	void kmp(String text, String pattern)
	{
		int m=pattern.length();
		int n=text.length();
		
		int i=0,j=0;
		int[] lps=new int[m];
		
		lps=computeLPS(pattern,m,lps);
	
		while(i<n)
		{
			if(pattern.charAt(j)==text.charAt(i))
			{
				i++;
				j++;
				//System.out.println(j);
			}
			if(j==m)
			{
				System.out.println("Pattern found at index " + (i-j));
				j=lps[j-1];
			}
			else if(i<n && pattern.charAt(j)!=text.charAt(i))
			{
				if(j!=0)
				{
					j=lps[j-1];
				}
				else
				{
					i++;
				}
			}
		}
	}	
	public static void main(String ghty[])
	{
		Scanner s=new Scanner(System.in);
		String text=s.next();
		String pattern=s.next();
		
		test obj=new test();
		obj.kmp(text,pattern);
	}
}
		