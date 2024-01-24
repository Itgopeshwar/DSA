package Src.DSA.CodingQuestion;

import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    public static void recur(int a,int b,int N){
        if(N==0){
            return;
        }
        System.out.print(a+b +" ");
        recur(b,a+b,N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int InputNumber= sc.nextInt();

        if(InputNumber==1){
            System.out.print(1);
        }
        else if(InputNumber > 2){
            System.out.print(1+" "+1+" ");
            recur(1,1,InputNumber-2);
        }
    }
}
