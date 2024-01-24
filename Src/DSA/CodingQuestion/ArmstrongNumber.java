package Src.DSA.CodingQuestion;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int InputNumber= sc.nextInt();
        int temp = InputNumber;
        int count = 0;

        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp=InputNumber;
        int sum =0;
        while(temp!=0){
            int digit = temp%10;
            sum+= (int) Math.pow(digit,count);
            temp=temp/10;

        }
        if(sum==InputNumber){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
