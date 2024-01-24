package Src.DSA.CodingQuestion;

import java.util.Scanner;

public class SubstringReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("original String Input");
        String orignalString = sc.nextLine();

        System.out.println("Old String Input");
        String oldString = sc.nextLine();

        System.out.println("new String Input");
        String newString = sc.nextLine();

        String ans = orignalString.replace(oldString,newString);
        System.out.println(ans);
    }
}
