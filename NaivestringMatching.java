class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        if(needle.length()>haystack.length())
        {
            return -1;
        }
        for(i=0;i<=haystack.length()-needle.length();i++)
        {
            int j=0;
            for(j=0;j<needle.length();j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
            }
            if(j==needle.length())
            {
                break;
            }
            
        }
        if(i==haystack.length()-needle.length()+1)
        {
            return -1;
        }
        return i;
    }
}