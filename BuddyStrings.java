class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length())
        {
            return false;
        }
        else
        {
            char[] arraya = A.toCharArray();
            char[] arrayb = B.toCharArray();
            int count=0;
            int flag=0;
            int pos1=0, pos2=0;
            
            for(int i=0;i<A.length();i++)
            {
                if(arraya[i]!=arrayb[i])
                {
                    count++;
                    if(count>2)
                    {
                        flag=1;
                        break;
                    }
                    else
                    {
                       if(pos1==0 && pos2 ==0)
                       {
                           pos1=i;
                       }
                        else
                        {
                            pos2=i;
                        }
                    }
                }
            }
            if(flag==1)
            {
                return false;
            }
            //System.out.println(count);
            int same=0;
            if(A.equals(B))
            {
                int check=0;
                int[] countera = new int[26];
                int[] counterb = new int[26];
                for(int i=0;i<26;i++)
                {
                    countera[i]=0;
                }
                for(int i=0;i<26;i++)
                {
                    counterb[i]=0;
                }
                for(int i=0;i<A.length();i++)
                {
                    countera[arraya[i]-'a']+=1;
                }
                for(int i=0;i<B.length();i++)
                {
                    counterb[arrayb[i]-'a']+=1;
                }
                for(int i=0;i<26;i++)
                {
                    if(countera[i]>=2 && counterb[i]>=2)
                    {
                        check=1;
                        return true;
                    }
                }
                if(check==0)
                {
                    return false;
                }
            }
            if(count!=2)
            {
                return false;
            }
            char temp=arraya[pos1];
            arraya[pos1]=arraya[pos2];
            arraya[pos2]=temp;
            String s = String.valueOf(arraya);
            //System.out.println(s);
            if(s.equals(B))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}