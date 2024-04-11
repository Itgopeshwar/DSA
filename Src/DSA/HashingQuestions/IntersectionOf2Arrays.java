package Src.DSA.HashingQuestions;

//Intersection of 2 arrays
//arri (7, 3, 9)
//arr2 {6, 3, 9, 2, 9, 4}
//intersection = 2 (3, 9)


import java.util.HashSet;

public class IntersectionOf2Arrays {
    public static int intersectionOf2Array(int[] arr1, int[] arr2){
        // Create HashSet
        HashSet<Integer> hashSet = new HashSet<>();

         int count=0;

        for (int i =0;i<= arr1.length;i++) {
            hashSet.add(i);
        }

        for (int j =0;j< arr2.length;j++){
            if (hashSet.contains(arr2[j])){
                count++;
                hashSet.remove(arr2[j]);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] Arr1 = {7, 3, 9,8};
        int[] Arr2 = {6, 3, 9, 2, 9, 4,8};

        System.out.println(intersectionOf2Array(Arr1,Arr2));
    }
}
