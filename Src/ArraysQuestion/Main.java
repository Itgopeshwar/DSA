package Src.ArraysQuestion;

import Src.ArraysQuestion.MaxFind.MaxElementInArray;
import Src.ArraysQuestion.MaxFind.MaxElementsJava8Stream;
import Src.ArraysQuestion.MaxFind.MaxElementsShorting;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 10, 100).toArray();
        // Print the array
        System.out.print("Original Arrays is :   ");
        for (int j : array) {System.out.print("  " + j);}
        System.out.println("\n");


        // code implements
        ReverseArrays reverseArrays = new ReverseArrays();
        reverseArrays.reverseArr(array,array.length-1);

        MaxElementInArray maxElementInArray = new MaxElementInArray();
        maxElementInArray.maxElementInArray(array,array.length);

        MaxElementsJava8Stream maxElementsJava8Stream = new MaxElementsJava8Stream();
        maxElementsJava8Stream .maxElementsJava8Stream(array,array.length);

        MaxElementsShorting maxElementsShorting = new MaxElementsShorting();
        maxElementsShorting.maxElementsUsingShorting(array);
    }
}