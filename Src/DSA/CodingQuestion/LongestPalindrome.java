package Src.DSA.CodingQuestion;

import java.util.Scanner;

public class LongestPalindrome {

    public static boolean Palindrome_cheek(String str , int i, int j){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :  ");
        String str = sc.next();
        int maxLenPalindrome=1;
        for(int i =0; i<=str.length();i++){
            for(int j = str.length()-1; j>=i;j--){
                if(Palindrome_cheek(str,i,j)){
                    maxLenPalindrome=Math.max(maxLenPalindrome,j-i+1);
                }
            }
        }
        System.out.print(maxLenPalindrome);
    }
}
