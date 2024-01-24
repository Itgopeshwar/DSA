package Src.DSA.CodingQuestion;

import java.util.Scanner;

public class DifferenceInFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter a number Factorial A :  ");
        int a= sc.nextInt();

        System.out.print("Enter a number Factorial B :  ");
        int b=sc.nextInt();

        //Factorials A
        int factorial_a=1;
        while (a>0){
            factorial_a=factorial_a*a;
            a--;
        }

        //Factorials B
        int factorial_b=1;
        while (b>0){
            factorial_b=factorial_b*b;
            b--;
        }

        // print
        int Difference_in_Factorials= factorial_a-factorial_b;
        System.out.println(Difference_in_Factorials);
    }
}
