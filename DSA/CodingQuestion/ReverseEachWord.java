package DSA.CodingQuestion;
import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println("Enter the String for  Reverse each word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String ans ="";

        for(int i=0;i<arr.length;i++){
            String temp = arr[i];
            String temp2 = "";

            for(int j = temp.length()-1; j>=0; j--){
                temp2 += temp.charAt(j);
            }
            ans+=temp2+" ";
        }
        System.out.print(ans);
    }
}
