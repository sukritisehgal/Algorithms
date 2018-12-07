class Java
{
	public static void main(String[] rfds)
	{
		String s1 = "abcdfhg";
		String s2 = "bcadghf";
		
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		
		for(int i=0;i<26;i++)
		{
			a1[i]=0;
			a2[i]=0;
		}
		
		char[] ar1 = s1.toCharArray();
		char[] ar2 = s2.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			//System.out.println((int)(ar1[i]-'a'));
			a1[(int)(ar1[i]-'a')]=1;
		}
		for(int i=0;i<s2.length();i++)
		{
			//System.out.println((int)(ar2[i]-'a'));
			a2[(int)(ar2[i]-'a')]=1;
		}
		/*for(int i=0;i<26;i++)
		{
			System.out.println(a2[i]);
		}*/
		int flag=0;
		for(int i=0;i<26;i++)
		{
			if(a1[i]!=a2[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
	}
}