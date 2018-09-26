class Solution {
    public String CommonPrefix(String s1, String s2)
    {
        String common = "";
        if(s1.length()>s2.length())
        {
            //System.out.println("In if");
            int l= s2.length();
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            for(int i=0;i<l;i++)
            {
                if(a1[i]==a2[i])
                {
                    StringBuffer sb = new StringBuffer(common);
                    sb.append(a1[i]);
                    common=sb.toString();
                    //System.out.println(common);
                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            //System.out.println("In else");
            int l= s1.length();
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            for(int i=0;i<l;i++)
            {
                if(a1[i]==a2[i])
                {
                    StringBuffer sb = new StringBuffer(common);
                    sb.append(a1[i]);
                    common=sb.toString();
                }
                else
                {
                    break;
                }
            }
        }
        return common;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        {
            return "";
        }
        String prefix = strs[0];
        
        for(int i=1;i<strs.length;i++)
        {
            prefix = CommonPrefix(prefix, strs[i]);
            //System.out.println(prefix);
        }
        return prefix;
    }
}