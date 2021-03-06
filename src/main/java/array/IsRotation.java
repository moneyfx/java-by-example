package array;


public class IsRotation {
    public static boolean isSubstring(String big, String small) {
        return big.contains(small);
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == 0 || (s1.length() != s2.length())) {
            return false;
        }

        String s1s1 = s1 + s1;

        return isSubstring(s1s1, s2);
    }

    public static void run() {
        String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean is_rotation = isRotation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + is_rotation);
        }
    }

}
