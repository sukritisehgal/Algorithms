import java.util.*;
class test
{
	void heapify(int[] array,int n ,int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n && array[l]>array[largest])
		{
			largest=l;	
		}
		if(r<n && array[r]>array[largest])
		{
			largest=r;
		}
		if(largest!=i)
		{
			int t=array[largest];
			array[largest]=array[i];
			array[i]=t;
			heapify(array,n,largest);
		}
	}
	void heapsort(int array[], int n)
	{
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(array,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			int t=array[0];
			array[0]=array[i];
			array[i]=t;
			
			heapify(array,i,0);
		}
		
	}
	
	public static void main(String gfrt[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		test obj=new test();
		obj.heapsort(array,size);
		
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]);
		}
	}
}
		