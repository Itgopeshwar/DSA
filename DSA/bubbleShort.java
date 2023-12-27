package DSA;

public class bubbleShort {
    static void bubbleSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]){
                    // swap  a[j] , a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[]a ={7,6,5,4,3,4,3,2,2,1,3,3,44,100,55,6,67,7,88,8,7,6,5,44,3,32,2,22,3,34,4,58,76,6};
        bubbleSort(a);
        for(int i:a){
            System.out.print(i + " ");
        }
    }
}
