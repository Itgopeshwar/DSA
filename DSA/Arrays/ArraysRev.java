package DSA.Arrays;

public class ArraysRev {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4,7,6,9,8,0};
        int arraysKeyLength=arr.length;


        for(int i=arraysKeyLength-1;  i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }


        int halfOfArray = (arr.length)/2;
        System.out.print("\n the half Arrays \n"+halfOfArray);
        for (int i = halfOfArray; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
