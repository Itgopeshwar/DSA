import Src.support.support;
public class Main {
    public static void main(String[] args) {
        System.out.println(" This is main ");

        // import objects use
        support obj=new support(); // objects

        int sum = obj.Add(23,7);
        System.out.println(sum);

        int diff = obj.Sub(70,20);
        System.out.println(diff);

        int multi=obj.Mul(2,3);
        System.out.println(multi);

        int div = obj.Div(30,2);
        System.out.println(div);
    }
}
