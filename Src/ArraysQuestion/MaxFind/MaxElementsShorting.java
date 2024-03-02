package Src.ArraysQuestion.MaxFind;

import java.util.Arrays;

public class MaxElementsShorting {
    public void maxElementsUsingShorting(int[] ansArr){
        Arrays.sort(ansArr);
        int tempStore = ansArr[ansArr.length-1];
        System.out.println("Largest using Shorting last elements is :  "+tempStore);
    }
}
