package DSA;

public class SelectionSort {
    static void selectionSort(int[]arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {  // represent current Index
            // Find minimum element from unsorted part of array
            int min_index = i;
            for (int j = 0; j < n ; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // swap current element and minimum element
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]= temp;

        }
    }
    public static void main(String[] args) {
        int []arr ={7,4,5,1,2,2,32,2,1,3,43,3,2,1,2,2,33,4,4,4,4};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
// selection sort is in-place algorithm
// it is chage the order
// it is not stable algorithm