import java.util.*;
class test
{
	public void anagrams(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println("Not anagrams");
		}
		else
		{
			char[] array1=str1.toCharArray();
			char[] array2=str2.toCharArray();
			
			int[] array=new int[26];
			
			for(int i=0;i<26;i++)
			{
				array[i]=0;
			}
			for(int i=0;i<str1.length();i++)
			{
				array[array1[i]-'a']=1;
			}
			for(int i=0;i<str2.length();i++)
			{
				if(array[array2[i]-'a']==1)
				{
					array[array2[i]-'a']=2;
				}
			}
			int flag=0;
			for(int i=0;i<26;i++)
			{
				if(array[i]==1)
				{
					flag=1;
					System.out.println("Not anagrams");
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Anagrams");
			}
		}
	}
	public static void main(String ghtu[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		
		test obj=new test();
		obj.anagrams(s1,s2);
	}
}
			