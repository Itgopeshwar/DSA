package Src.DSA.Shorting;

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
        int[]a ={112,100,111,637,704,206,83,203,876,234,141,1024,1326,32,856};
        bubbleSort(a);
        for(int i:a){
            System.out.print(i + "   ");
        }
    }
}
