import java.util.*;

class test
{
	int updateBits(int num1,int num2,int i,int j)
	{
		int max=~0;
		int left=max-((1<<(j+1))-1);
		int right=(1<<i)-1;
		int mask=(int)left|right;
		
		return (num1 & mask)| (num2<<i);
	}
		
	public static void main(String fgty[])
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int i=s.nextInt();
		int j=s.nextInt();
		
		test obj=new test();
		int res=obj.updateBits(num1,num2,i,j);
		System.out.println(res);
	}
}