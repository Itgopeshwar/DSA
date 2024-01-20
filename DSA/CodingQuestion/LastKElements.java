package DSA.CodingQuestion;

import java.util.*;
public class LastKElements {
    public static void main(String[] args) {
        System.out.print("Enter Size of Arrays");
        Scanner sc = new Scanner(System.in);
        int arraySizeInput = sc.nextInt();

        int arr[]=new int[arraySizeInput];

        for(int i=0;i<arraySizeInput;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the 'k' value");
        int k = sc.nextInt();
        for(int j = arr.length-k ; j<arr.length ; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
