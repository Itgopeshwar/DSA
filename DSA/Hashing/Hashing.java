package DSA.Hashing;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {

        //Creating HashSet
        HashSet<Integer> setName = new HashSet<>();

        //Insert
        setName.add(1);
        setName.add(2);
        setName.add(3);
        setName.add(1);

        // Size of HashSet
        System.out.println("Size of set is : " + setName.size()); // Size of set is : 3

//        // Search - contains
//        if (setName.contains(1)){
//            System.out.println("set contains 1");
//        }
//
//        if (!setName.contains(6)){
//            System.out.println("does not contain");
//        }
//
//
//        // Delete
//        setName.remove(1);
//        if (!setName.contains(1)){
//            System.out.println("set contains 1 is remove");
//        }
    }
}
