package Src.DSA.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Map is interfaced
        // HashMap is class
        // Key arrange in Ascending order
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, " Md");
        map.put(3, " haider");
        map.put(2, " mohsin");
        System.out.println(map);

        // value override
        map.put(1, "Devil");
        System.out.println(map);

        // get values to throw targeted key
        System.out.println(map.get(2));

        // boolean
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(" mohsin"));

        // get all separate keys and other is value
        System.out.println(map.keySet());
        System.out.println(map.values());

        // iterative method used for key only print
        for (Integer i : map.keySet()) { // You can replacement with Integer by var
            System.out.print(i + " ");
        }
        System.out.println("\n...................");

        // iterative method used for key only print
        for (String j : map.values()) {  // You can replacement with String by var
            System.out.print(j + " ");
        }
        System.out.println("\n...................");
    }
}
