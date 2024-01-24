package Src.DSA.Arrays;

class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x !=0){
            int numDigit = x % 10;

            if ((ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE / 10)) {
                return 0;
            }


            ans = (ans * 10) + numDigit;
            x = x/10;
        }
        return ans;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int ans = solution.reverse(1234567890);
        System.out.println(ans);
    }
}