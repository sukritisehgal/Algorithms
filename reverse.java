 class Solution {
    // you need treat n as an unsigned value
    public static void main(String[] args) {
    int n = 4294967295;
                n=Math.abs(n);
        String s = Integer.toBinaryString(n);
        if(s.length()<32)
        {
            String str="";
            StringBuffer sb = new StringBuffer(str);
            int diff = 32-s.length();
            for(int i=0;i<diff;i++)
            {
                sb.append('0');
            }
            sb.append(s);
            sb.reverse();
            String tr=sb.toString();
            long x = Long.parseLong(tr,2);
            System.out.println(x);
            //return (int)x;
            
        }
        else
        {
        //System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String str=sb.toString();
        long x = Long.parseLong(str,2);
        System.out.println(x);
        //return (int)x;
        }
        
    }
}