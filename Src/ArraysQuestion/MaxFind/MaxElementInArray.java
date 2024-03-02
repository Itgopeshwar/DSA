package Src.ArraysQuestion.MaxFind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxElementInArray {
    public void maxElementInArray(int[] ansArray, int arraySize){
        // Code
        List<Integer> list = new ArrayList<>(); //Adding elements in List
        for (int i = 0; i < arraySize-1; i++) {
            list.add(ansArray[i]);
        }
        // Using the Method to find the maximum element
        System.out.println("Largest in given array is :  "+ Collections.max(list));
    }
}

//There are certain methods to find the Largest Element in an Array as mentioned below:
//        1. Iterative Way
//        2. Java 8 Stream
//        3. Sorting
//        4. Using Collections.max()
