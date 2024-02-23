package Src.DSA.SearchAlgo;

public class SwapBetweenSize {

    void SwapNum(int[] arr,int size){
        //ittrating 
        for (int i = 0; i < arr.length; i+=2) {
            if (i+1 < size) {
                swap();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,8,6,4,3,8,9,5,7}; // for even number
        int[] arrOdd = {23,45,67,89,20,42,62}; // for odd number
    }
}

// how to add two number