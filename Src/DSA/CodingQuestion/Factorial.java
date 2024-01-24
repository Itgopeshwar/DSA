package Src.DSA.CodingQuestion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which is find Factorial : ");
        int input = sc.nextInt();
        int ans = 1;
        while(input > 1){
            ans*=input;
            input--;
        }
        System.out.print("Factorial is : "+ans);
    }
}
