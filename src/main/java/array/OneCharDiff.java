package array;

import java.util.HashMap;
import java.util.Map;

public class OneCharDiff {

    public static void run() {
        System.out.println("ple " + " ple " + isOneWay("ple", "ple"));
        System.out.println("pales " + " pale " + isOneWay("pales", "pale"));
        System.out.println("bale " + " pale " + isOneWay("bale", "pale"));
        System.out.println("pale " + " bake " + isOneWay("pale", "bake"));
    }

    //detect if this is one way
    public static boolean isOneWay(String str1, String str2) {
        int numberOfDifference = 0;

        if (Math.abs(str1.length() - str2.length()) > 1 ) {
            return false;
        }

        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < str1.length(); i++) {
            if (hm.get(str1.charAt(i)) == null) {
                hm.put(str1.charAt(i), 1);
            } else {
                hm.put(str1.charAt(i), hm.get(str1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (hm.get(str2.charAt(i)) != null) {
                hm.put(str2.charAt(i), hm.get(str2.charAt(i)) - 1 );
            }
        }

        for (Integer value : hm.values()) {
            if (value > 0) {
                numberOfDifference++;
            }
        }

        return (numberOfDifference <= 1);
    }
}
