class Solution {
    public String customSortString(String s, String t) {
        String str ="";
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            int count=0;
            for(int j=0;j<t.length();j++)
            {
                if(x==t.charAt(j))
                {
                    count++;
                }
            }
            for(int j=0;j<count;j++)
            {
                sb.append(s.charAt(i));
            }
        }
        str=sb.toString();
        ArrayList<Character> l = new ArrayList<Character>();
        for(int i=0;i<t.length();i++)
        {
            int flag=0;
            for(int j=0;j<str.length();j++)
            {
                if(t.charAt(i)==str.charAt(j))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                l.add(t.charAt(i));
                
                sb.append(t.charAt(i));
                
            }
        }
        sb = new StringBuffer(str);
        for(int i=0;i<l.size();i++)
        {
            sb.append(l.get(i));
        }
        str=sb.toString();
        return str;
    }
}