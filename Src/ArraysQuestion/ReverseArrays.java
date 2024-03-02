package Src.ArraysQuestion;

import java.util.Arrays;

class ReverseArrays {
    void reverseArr(int[] ans , int arrSize){
        // code
        // Two pointer approach
        int startIndex = 0;
         while (startIndex<=arrSize-1){
             int temp = ans[startIndex];
             ans[startIndex] = ans[arrSize];
             ans[arrSize]=temp;
             startIndex ++;
             arrSize --;
         }
         String toConvert_Interger_toString = Arrays.toString(ans);
         System.out.println(toConvert_Interger_toString);
    }
}
