package Src.DSA.Arrays;

public class SwapFunctionArray {

    void swapFun(int arr[],int size){
        for (int i = 0; i < arr.length; i+=2) {
            if (i+1<size) {
                // code
                int tem=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tem;
            }
        }
    }
    public static void main(String[] args) {
        int array[]={5,3,2,8,4,6};
        SwapFunctionArray swap_obj=new SwapFunctionArray();
        swap_obj.swapFun(array,array.length);
        for (int i : array) {
            System.out.print(" "+ i);
        }
    }
    
}
