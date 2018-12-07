class Solution {
    public int countPrimes(int n) {
        if(n==0||n==2|| n==1)
        {
            return 0;
        }
        if(n==3)
        {
            return 1;
        }
        boolean[] array = new boolean[n+1];
        for(int i=0;i<array.length;i++)
        {
            array[i]=true;
        }

        for(int p=2; p*p<=n;p++)
        {
            if(array[p]==true)
            {
                for(int i=2*p;i<=n;i+=p)
                {
                    array[i]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]==true)
            {
                count++;
            }
        }
        return count-2;
        
    }
}