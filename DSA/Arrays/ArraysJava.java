package DSA.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4,7,6,9,8,0};
        int key;
        key=arr.length;
        System.out.print(key);
        System.out.println("  "); //for next line

        for (int i = 0; i < arr.length; i++) {
            int tempValue= arr[i];
            System.out.print(tempValue);
        }

        System.out.println("  "); //for next line
//        System.out.println(arr[0]); // 1,2,3,4,5,6,7,8,9
    }
}

