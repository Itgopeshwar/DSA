package Src.DSA.CodingQuestion;
import java.util.Scanner;
import java.util.HashMap;
public class EliminateDuplicateValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :  ");
        int SizeOfArr = sc.nextInt();
        int[] arr = new int[SizeOfArr];

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the elements in arr => "+ i +" :  ");
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i]) == 1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
