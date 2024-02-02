package Src.support;

public class support {
    public int Add(int first, int second){
        int sum=first+second;
        return sum;
    }

    public int Sub(int first, int second){
        int sub=first-second;
        return sub;
    }
    public int Mul(int first , int second){
        int mul=first*second;
        return mul;
    }
    public int Div(int first,int second){
        int div;
        if (first>=second){
            div=first/second;
        }
        else {
            div=second/first;
        }
        return div;
    }
}
