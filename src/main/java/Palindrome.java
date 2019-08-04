/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */

public class Palindrome {

    public static boolean isPalindrome(String input) {

        return input.equals(reverse(input));

    }

    public static String reverse(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("hihxx");
        System.out.println("Is the string palindrome" + result);
    }
}

