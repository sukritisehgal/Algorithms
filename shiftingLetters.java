class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        
        char[] array = S.toCharArray();
        for(int i=0;i<shifts.length;i++)
        {
            if(shifts[i]>26)
            {
                shifts[i]%=26;       
            }
            System.out.println(shifts[i]);
        }
        for(int i=0;i<shifts.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int x = (int)array[j];
                x=x+shifts[i];
                if(x>122)
                {
                    int y = x%122;
                    x=96+y;
                }
                array[j]=(char)x;
            }
        }
        S=String.valueOf(array);
        return S;
    }
}