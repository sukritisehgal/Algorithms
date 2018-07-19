static int sansaXor(int[] arr) {
        if(arr.length%2==0)
        {
            return 0;
        }
        else
        {
            int result=arr[0];
            for(int i=2;i<arr.length;i=i+2)
            {
                result=(int)result^arr[i]; 
            }
            return result;
        }

    }
    
SANSA AND XOR
Sample Input 0
2
3
1 2 3
4
4 5 7 5
Sample Output 0
2
0
Explanation 0
Test case 0: 
1^2^3^(1^2)^(2^3)^(1^2^3)

Test case 1: 
4^5^7^5^(4^5)^(5^7)^(7^5)^(4^5^7)^(5^7^5)^(4^5^7^5)