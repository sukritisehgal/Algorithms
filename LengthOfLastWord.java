class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int spaces=0;
        for(;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(i==s.length()-1 || s.charAt(i+1)==' ')
                {
                    spaces+=1;
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        if(spaces==0)
        {
            String last = s.substring(i+1,s.length());
            return last.length();
        }
        else
        {
            String last = s.substring(i+1,s.length());
            return last.length()-spaces;
        }
    }
}