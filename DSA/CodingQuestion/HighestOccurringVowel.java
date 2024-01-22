package DSA.CodingQuestion;

import java.util.Scanner;

public class HighestOccurringVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charArr[]={'a','e','i','o','u'};
        int arr[] = new int[5];
        System.out.println("Enter the String for Highest occurring vowel");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            for(int j=0;j<5;j++){
                if(ch==charArr[j]){
                    arr[j]++;
                }
            }
        }
        int max_occ = -1;
        int ind =-1;

        for(int i=0;i<5;i++){
            if(max_occ < arr[i]){
                max_occ=arr[i];
                ind=i;
            }
        }
        System.out.print(charArr[ind]);

    }
}
