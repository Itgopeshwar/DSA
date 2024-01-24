package Src.DSA.CodingQuestion;
import java.util.*;
public class CountCarry {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int sum=0,carry=0,op=0;
        while(a>0||b>0){
            sum= a%10 + b%10 + carry;
            carry= sum/10;
            op +=carry;
            a=a/10;
            b=b/10;
        }
        System.out.println("Total Count Carry : " +op);
    }
}
