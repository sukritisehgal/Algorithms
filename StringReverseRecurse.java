class Java
{
	String reverse(String str)
	{
		if(str.length()<2)
		{
			return str;
		}
		return str.substring(1) + str.charAt(0);
	}
	
	public static void main(String[] tgf)
	{
		String str = "hello";
		Java obj = new Java();
		str = obj.reverse(str);
		System.out.println(str);
	}
}