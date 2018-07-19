import java.util.*;
class test
{
	public void removeDup(String str)
	{
		char array[]=str.toCharArray();
		int len=str.length();
		int count=0;
		
		int tail=1;
		for( int i=1;i<len;i++)
		{
			int j;
			for(j=0;j<tail;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					break;
				}
			}
			if(j==tail)
			{
				array[tail]=array[i];
				tail++;
			}
		}
		String s=String.valueOf(array); // Important
		StringBuilder sb=new StringBuilder(s);
		sb.delete(len-count,len);
		s=sb.toString();
		System.out.println(s);
		/*for(int i=0;i<len-count;i++)
		{
			System.out.print(array[i]);
		}*/
	}
	public static void main(String gth[])
	{
		test obj=new test();
		obj.removeDup("abcdagb");
	}
}
		