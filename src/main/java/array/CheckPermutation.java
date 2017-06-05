/*
* Same characters but different order
* Below are the permutations of string ABC.
* ABC ACB BAC BCA CBA CAB
*/
package array;

import java.util.*;

public class CheckPermutation {
    public static void run(String[] args) {
        String s1 = "ABC";
        String s2 = "ACB";

        System.out.println(s1 + " " + s2 + " = " + isPermutation(s1, s2));

        s1 = "rra";
        s2 = "raa";
        System.out.println(s1 + " " + s2 + " = " + isPermutation(s1, s2));
    }


    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (hm.get(currentChar) != null) {
                hm.put(currentChar, hm.get(currentChar) + 1);
            } else {
                hm.put(currentChar, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            if (hm.get(currentChar) == null) {
                return false;
            } else {
                hm.put(currentChar, hm.get(currentChar) - 1);
            }
        }

        for (Integer value : hm.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
