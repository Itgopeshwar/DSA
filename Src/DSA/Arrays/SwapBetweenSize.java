
package Src.DSA.Arrays;

public class SwapBetweenSize {

    void SwapNum(int[] arr, int size) {
        // iterating
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < size) {
                int temp = arr[i]; // Swaping number user define 
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                // swap(List list, int i, int j) // this is the pre define swaping number 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 6, 4, 3, 8, 9, 5, 7,40 }; // for even number
        int[] arrOdd = { 23, 45, 67, 89, 20, 42, 62 }; // for odd number

        SwapBetweenSize swapBetweenSize = new SwapBetweenSize(); // creating object of class SwapNum
        swapBetweenSize.SwapNum(arr, arr.length); // swaping number 
        swapBetweenSize.SwapNum(arrOdd, arrOdd.length);

        // printing the swapped arrays
        System.out.println("Swapped array for even numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSwapped array for odd numbers:");
        for (int num : arrOdd) {
            System.out.print(num + " ");
        }
    }
}
