package Src.DSA.HashingQuestions;

//Union of 2 arrays
//arri (7, 3, 9)
//arr2 = (6, 3, 9, 2, 9, 4)
//unions 6 (7, 3, 9, 6, 2, 4)

import java.util.HashSet;

public class UnionOf2Arrays {

    public static void unionOf2Arrays(int[] arr1,int[] arr2){
        // create HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        for (int k : arr1) {
            hashSet.add(k);
        }

        for (int j : arr2) {
            hashSet.add(j);
        }
        System.out.println("length of Array "+hashSet.size()+"\nElements in union Arrays is  "+hashSet);
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        unionOf2Arrays(arr1,arr2);
    }
}
