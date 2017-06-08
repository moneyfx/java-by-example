package array;


public class StringCompression {

    public static void run(String[] args) {
        for (String str : args) {
            System.out.println(str + " = " + compress(str));
        }
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++ ) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                sb.append(count);
                count = 1;
                sb.append(str.charAt(i));
            }
        }

        sb.append(count);

        if (sb.length() >= str.length()) {
            return str;
        } else {
            return sb.toString();
        }
    }
}
