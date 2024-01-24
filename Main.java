import Src.support.support;
public class Main {
    public static void main(String[] args) {
        System.out.println(" This is main ");

        // import objects use
        support obj=new support();

        int sum = obj.Add(23,7);
        System.out.println(sum);

        int diff = obj.Sub(70,20);
        System.out.println(diff);

    }
}
