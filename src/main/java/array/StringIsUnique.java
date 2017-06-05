package array;

import java.util.HashMap;
import java.util.Map;

public class StringIsUnique {
    public static void run(String[] args) {
        for (String stringForTest: args) {
            if (isUnique(stringForTest)) {
                System.out.println(stringForTest + " has all unique chars");
            } else {
                System.out.println(stringForTest + " is not unique");
            }
        }
    }

    private static boolean isUnique(String string) {
        Map<Character, Boolean> hm = new HashMap<Character, Boolean>();

        for (int i = 0; i < string.length(); i++) {
            if (hm.get(string.charAt(i)) != null) {
                return false;
            }

            hm.put(string.charAt(i), true);
        }

        return true;
    }
}
