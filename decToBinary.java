import java.util.*;

class test
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		int intPart=Integer.parseInt(str.substring(0,str.indexOf('.')));
		double doublePart=Double.parseDouble(str.substring(str.indexOf('.'),str.length()));
		//System.out.println(doublePart);
		
		String res;
		String temp=Integer.toBinaryString(intPart);
		
		res=temp;
		int count=1;
		int flag=0;
		
		String decPart="";
		StringBuffer sb=new StringBuffer(decPart);
		while(doublePart!=1.0 || count<=32)
		{
			doublePart*=2;
			int dup=(int)((doublePart*10)/10);
			//System.out.println(dup);
			sb.append(dup);
			
			if(doublePart==1.0)
			{
				flag=1;
				break;
			}
			if(dup==1)
			{
				doublePart-=1;
			}
			count++;
		}
		if(flag==0)
		{
			System.out.println("ERROR");
		}
		else
		{
			decPart=sb.toString();
			res=res+"."+decPart;
			
			System.out.println(res);
		}
	}
}
			
		
		
		
		