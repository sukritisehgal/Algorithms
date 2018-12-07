class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                //System.out.println(i);
                list.add(i);
                list.add(num/i);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum+=list.get(i);
        }
        if(sum==num)
        {
            return true;
        }
        return false;
    }
}