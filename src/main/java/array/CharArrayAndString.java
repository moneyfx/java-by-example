package array;


public class CharArrayAndString {

    public static void run(String[] arg) {
        String text = "This is my string";
        System.out.println("original string = " + text);

        //convert string to char array
        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        //char array back to string
        String str = new String(charArray);
        System.out.println("new str = " + str);
    }
}
