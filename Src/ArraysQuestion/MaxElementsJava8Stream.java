package Src.ArraysQuestion;

import java.util.Arrays;

class MaxElementsJava8Stream {
    void maxElementsJava8Stream(int[] ansArr,int arrSize){
        int maxAns = Arrays.stream(ansArr).max().getAsInt();
        System.out.println("Largest num using Java 8 Stream :  "+maxAns);
    }

}
