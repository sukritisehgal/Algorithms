class Solution {
    
    String sub_digit(char c1, char c2, String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.append(c1);
        sb.append(c2);
        str=sb.toString();
        
        return str;
    }
    String digit(char c1, int n, String str)
    {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<n;i++)
        {
            sb.append(c1);
        }
        str=sb.toString();
        
        return str;
    }
    public String intToRoman(int num) {
    
        String res="";
        while(num!=0)
        {
        if(num>=1000)
        {
            res = digit('M', num/1000, res);
            num=num%1000;
        }
        if(num>=500)
        {
            if(num>=900)
            {
                res = sub_digit('C','M', res);
                num%=100;
            }
            else
            {
                res = digit('D', num/500, res);
                num=num%500;
            }
        }
        if(num>=100)
        {
            if(num>=400)
            {
                res = sub_digit('C','D', res);
                num%=100;
            }
            else
            {
                res = digit('C', num/100, res);
                num=num%100;
            }
        }
        if(num>=50)
        {
            if(num>=90)
            {
                res = sub_digit('X','C', res);
                num%=10;
            }
            else
            {
                res = digit('L', num/50, res);
                num=num%50;
            }
        }
        if(num>=10)
        {
            if(num>=40)
            {
                res = sub_digit('X','L', res);
                num%=10;
            }
            else
            {
                res = digit('X', num/10, res);
                num=num%10;
            }
        }
        if(num>=5)
        {
            if(num>=9)
            {
                res = sub_digit('I','X', res);
                num=0;
            }
            else
            {
                res = digit('V', num/5, res);
                num%=5;
            }
        }
        if(num>=1)
        {
            if(num==4)
            {
                res = sub_digit('I','V', res);
                num=0;
            }
            else
            {
                res = digit('I', num, res);
                num=0;
            }
        }
        }
        return res;
    }
}