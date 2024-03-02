package Src.ArraysQuestion.MaxFind;

import java.util.Arrays;

public class MaxElementsJava8Stream {
    public void maxElementsJava8Stream(int[] ansArr,int arrSize){
        int maxAns = Arrays.stream(ansArr).max().getAsInt();
        System.out.println("Largest num using Java 8 Stream :  "+maxAns);
    }

}
