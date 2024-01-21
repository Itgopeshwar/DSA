package DSA.Hashing;

import java.util.HashMap;

public class HashMapInJava {
    public static void main(String[] args) {
        System.out.println("HashMap in Java");

        //Creating HashMap in Java
        HashMap<String,Integer> mapUserDefineName = new HashMap<>();

//        Insertion
        mapUserDefineName.put("India",120);
        mapUserDefineName.put("US", 30);
        mapUserDefineName.put("China", 150);

        System.out.println(mapUserDefineName);

        mapUserDefineName.put("China",180);
        System.out.println(mapUserDefineName);
    }
}
