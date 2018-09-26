class Solution {
    int value(char c)
    {
        if(c=='I')
        {
            return 1;
        }
        else if(c=='V')
        {
            return 5;
        }
        else if(c=='X')
        {
            return 10;
        }
        else if(c=='L')
        {
            return 50;
        }
        else if(c=='C')
        {
            return 100;
        }
        else if(c=='D')
        {
            return 500;
        }
        else if(c=='M')
        {
            return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int s1 = value(s.charAt(i));
            int s2=0;
            if(i+1<s.length())
            {
                s2 = value(s.charAt(i+1));
                if(s1>=s2)
                {
                    res=res+s1;
                }
                else
                {
                    res=res+s2-s1;
                    i++;
                }
            }
            else
            {
                res=res+s1;
                i++;
            }
        }
        return res;
    }
}