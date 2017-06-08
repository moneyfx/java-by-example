/*
*   palindrome /ˈpælɪnˌdroʊm/
*   a word or phrase that is the same whether you read it forward or backward, such as “noon” or “not a ton”
*
*
*   A string is a palindrome if it remains unchanged when reversed
*   A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left.
*   the string "iTopiNonAvevanoNipoti" is a palindrome, while the string "iGattiNonAvevanoCugini" is not so.
*   "dad" is a palindrome whereas "program" is not a palindrome.
*   Some other palindrome strings are "mom", "madam", "abcba".
*/

package array;


public class PalindromeDemo {

    public static void run(String[] args) {

        for (String str : args) {
            System.out.println("isPalindromeByStringBuilder " + str + " " + isPalindromeByStringBuilder(str));
            System.out.println("isPalindromeByLoop " + str + " " + isPalindromeByLoop(str));
        }
    }

    public static boolean isPalindromeByStringBuilder(String str) {

        StringBuilder sb = new StringBuilder(str);

        return (str.equalsIgnoreCase(sb.reverse().toString()));
    }

    public static boolean isPalindromeByLoop(String str) {
        int lengthOfStr = str.length();

        for (int i = 0; i < lengthOfStr; i++) {
            int endIndex = (lengthOfStr - i) - 1;

            if (i >= endIndex) {
                break;
            }

            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(endIndex))) {
                return false;
            }
        }

        return true;
    }
}
