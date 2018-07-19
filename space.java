import java.util.*;
import java.io.*;
class test
{
	void replace(char[] array,int length)
	{
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
		StringBuffer sb=new StringBuffer();
		for(char x : array)
		{
			if(x==' ')
			{
				//System.out.println("Space");
				sb.append('%');
				sb.append('2');
				sb.append('0');
			}
			else
			{
				sb.append(x);
			}
		}
		/*for(int i=0;i<new_len;i++)
		{
			System.out.print(new_array[i]);
		}*/
		String str=sb.toString();
		System.out.println(str);
	}
	public static void main(String hjyu[])
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length : ");
		int length=s.nextInt();
		char array[]=new char[length];
		try
		{
			for(int i=0;i<length;i++)
			{
				array[i]=(char)bf.read();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		test obj=new test();
		obj.replace(array,length);
	}
}