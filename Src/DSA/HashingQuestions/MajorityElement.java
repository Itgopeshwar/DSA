package Src.DSA.HashingQuestions;

import java.util.HashMap;

/* Questions
Majority Element

Given an integer array of size n, find all elements that appear more than [ n/3 ] times.

Numbs[] = (1, 3, 2, 5, 1, 3, 1, 5, 1);
111

numbs[ I = {1, 2);
11 1, 2
*/


public class MajorityElement {

    public static void majorityElement(int num[]){
        // create map
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        // Find frequency of all the number & Store in Map
        int n = num. length;
        for(int i=0; i<n; i++) {
            if (map.containsKey(num[i])){ // true
                map.put(num[i],map.get(num[i])+1);
            }
            else { // false
                map. put (num [i],1);
            }
        }

        // print MajorityElement
        for (int key :map.keySet() ) {
            if (map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(num);
    }
}
