import java.util.*;

class test
{
	boolean get_bit(int n,int index)
	{
		//To find the first one
		
		return(( n & (1<<index))>0);
	}
	int set_bit(int n, int index,boolean b)
	{
		if(b)
		{
			//Turn 0 to 1
			
			return n | (1<<index);
		}
		else
		{
			//turn 1 to 0
			
			int mask=~(1<<index);
			return n & mask;
		}
	}
		
	int get_next(int n)
	{
		int index=0;
		int countOnes=0;
		
		while(!get_bit(n,index))
		{
			//stop when get_bit returns 1
			
			index++;
		}
		while(get_bit(n,index))
		{
			//stop when get_bit returns 0
			
			index++;
			countOnes++;
		}
		int temp=n;
		temp=set_bit(temp,index,true); // set this 0 to 1
		index--;
		
		while(!get_bit(temp,index))
		{
			index--;
		}
		temp=set_bit(temp,index,false);
		countOnes--;
		
		//set all bits to the left of index as 0
		
		for(int i=index-1;i>=countOnes;i--)
		{
			temp=set_bit(temp,i,false);
		}
		
		for(int i=countOnes-1;i>=0;i--)
		{
			temp=set_bit(temp,i,true);
		}
		return temp;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		test obj=new test();
		int next=obj.get_next(n);
		System.out.println(next);
	}
}

