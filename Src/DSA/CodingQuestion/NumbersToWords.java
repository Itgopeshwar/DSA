package Src.DSA.CodingQuestion;

import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number Numbers to Words :  ");
        int N=sc.nextInt();

        String ones[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
                "Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen",
                "Eighteen", "Nineteen"};

        String tens[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        String ans="";
        int temp=N%100;
        N=N/100;
        if(temp<20){
            ans=ones[temp];
        }
        else{
            ans+=ones[temp%10];
            ans=tens[temp/10]+ " "+ans;
        }
        if(N>0 && N%10>0){
            ans= ones[N%10]+" Hundred "+ans;
        }
        N=N/10;
        if(N>0){
            ans=ones[N]+" Thousand "+ans;
        }
        System.out.print("Numbers to Words :  "+ans);
    }
}
