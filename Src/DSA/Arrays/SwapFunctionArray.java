package Src.DSA.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapFunctionArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(3);
        System.out.println("before swap "+list);
        for (int i = 0; i < list.size(); i++) {
            int j=i++;
            Collections.swap(list,i,j);
        }
        System.out.println(list);
    }
    
}
