package Src.DSA.SearchAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,5,9,13,27};
        int mid,start,end,key,ans;
        key=13;
        start=0;
        end=arr.length;
        mid=(start+end)/2;
        System.out.println("start index "+start);
        System.out.println("end index "+end);
        System.out.println("mid index"+mid);
        System.out.println("mid element "+arr[mid]);
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
            if (arr[i]==arr[mid]){
                System.out.println(arr[i]);
            }

        }
    }

}
