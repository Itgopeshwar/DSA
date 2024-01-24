package Src.DSA.CodingQuestion;


import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Strings");
        String str = sc.next();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hs.contains(ch)){
                continue;
            }else{
                System.out.print(ch);
                hs.add(ch);
            }
        }
    }
}
