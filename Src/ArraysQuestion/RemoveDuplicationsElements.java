package Src.ArraysQuestion;

import java.util.Arrays;

public class RemoveDuplicationsElements {
    public static void main(String[] args) {
        int[] arrays = {4,0,5,4,5,5,3,1,3,9,6,4,9,3,6,8,8,5,1,0,8,1,2,3,4,5,6,7,8,9};
        Arrays.sort(arrays);
        int j=0;
        for (int i = 0; i <arrays.length-1 ; i++) {
            if (arrays[i] != arrays[i+1]){
                arrays[j++]=arrays[i];
            }
        }
        arrays[j++]=arrays[arrays.length-1];
        for (int i = 0; i < j; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
