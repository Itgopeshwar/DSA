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
        int[]a ={112,100,111,637,704,206,83,203,876,234,141,217,125,15,560,31,215,75,344,39,40,90,216,77,78,15,121,136,268,319,15,167,253,252,20,3,1,438,53,162,231,42,76,36,48,84,22,17,1277,221,516,1143,416,63,62,200,1461,1047,680,125,164,118,59,54,1024,1326,32,856};
        bubbleSort(a);
        for(int i:a){
            System.out.println(i + "   ");
        }
    }
}
