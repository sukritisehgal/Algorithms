import java.util.*;
class test
{
	public static void main(String ghty[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int matrix[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		for(int layer=0;layer<n/2;layer++)
		{
			int first=layer;
			int last=n-layer-1;
			
			for(int i=first;i<last;i++)
			{
				int offset=i-layer;
				int top=matrix[first][Math.abs(offset-layer)];
				
				matrix[first][Math.abs(offset-layer)]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[Math.abs(offset-layer)][last];
				matrix[Math.abs(offset-layer)][last]=top;
			}
		}
				
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
}