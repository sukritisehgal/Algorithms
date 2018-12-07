class Solution {
    public int maxDivide(int a, int b)
    {
        while(a%b==0)
        {
            a=a/b;
        }
        return a;
    }
    public boolean isUgly(int num) {
        if(num==0)
        {
            return false;
        }
        int n =0;
        n = maxDivide(num,2);
        //System.out.println(n);
        n = maxDivide(n,3);
        //System.out.println(n);
        n = maxDivide(n,5);
        //System.out.println(n);
        
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}