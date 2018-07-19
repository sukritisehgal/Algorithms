/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	ArrayList<String> Listofsubsequences = new ArrayList<String>();
	void findSubsequences(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j= s.length();j>i;j--)
			{
				String substr = s.substring(i,j);
				if(!Listofsubsequences.contains(substr))
				{
					Listofsubsequences.add(substr);
				}
				for(int k=i;k<j;k++)
				{
					StringBuffer sb = new StringBuffer(s);
					sb.deleteCharAt(k);
					if(!Listofsubsequences.contains(substr))
					{
						findSubsequences(sb.toString());
					}
				}
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "ab";
		Ideone obj=new Ideone();
		obj.findSubsequences(s);
		Collections.sort(obj.Listofsubsequences);
		Iterator i = obj.Listofsubsequences.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		// your code goes here
	}
}