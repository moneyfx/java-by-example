package array;

public class URLify {

    public static void run(String[] args) {
        String s1 = "Mr John Smith    ";
        System.out.println(replaceSpaceByStringBuilder(s1));
    }

    public static String replaceSpaceByStringBuilder(String s) {

        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (sb.length() == sb.capacity()) {
                break;
            }

            if (currentChar != ' ') {
                sb.append(currentChar);
            } else {
                sb.append("%20");
            }
        }

        return sb.toString();
    }
}
