import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        for(int i=0;i<test;i++)
            {
                String s1=s.next();
                String s2=s.next();
            int flag=0;
            
                int store[]=new int[26];
            for(int j=0;j<26;j++)
                {
                    store[j]=0;
            }
            char arr1[]=s1.toCharArray();
            char arr2[]=s2.toCharArray();
            
            for(int j=0;j<s1.length();j++)
                {
                    store[arr1[j]-'a']=1;
            }
            for(int j=0;j<s2.length();j++)
                {
                if(store[arr2[j]-'a']==1)
                    {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                {
                System.out.println("YES");
            }
            else
                {
                System.out.println("NO");
            }
        }
    }
}