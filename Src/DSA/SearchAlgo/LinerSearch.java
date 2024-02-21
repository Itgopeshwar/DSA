package Src.DSA.SearchAlgo;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key ");
        int key = sc.nextInt();
        sc.close();
        int[] array = {2,1,4,3,5,6,8,7,9};
        for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
            if (array[i] == key) {
                System.out.println("your key is find " + key +" index " +i);
            }
        }
    }
}
