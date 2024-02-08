package Src.DSA.SearchAlgo;

public class BinarySearch {

    public static int binarySearch(int arr[],int size,int key){
        int start = 0;
        int end = size-1;

        int mid_index= (start + end)/2;

        while (start <= end){
            if (arr[mid_index] == key){
                return mid_index;
            }

            if (key > arr[mid_index]){
                start = mid_index+1;
            }
            else {
                end=mid_index-1;
            }
            mid_index = (start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] even_number_of_arr = {2,4,6,8,12,18};
        int []odd_number_of_arr={3,11,18,23,32};

        int even_index= binarySearch(even_number_of_arr,6,18);
        System.out.println("place no. is : "+ (even_index+1) +" and number is : "+ even_number_of_arr[even_index]);

        int odd_index= binarySearch(odd_number_of_arr,6,18);
        System.out.println("place no. is : "+ (odd_index+1) +" and number is : "+ odd_number_of_arr[odd_index]);
    }

}
