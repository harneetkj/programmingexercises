import java.util.Arrays;
import java.util.Scanner;

/**
 * Given two strings original and anagaram , write a function to determine if string anagram is an anagram of string originL.
 */
public class AnaGram {

    public static boolean IsEqual(String Original, String Anagram) {

        char[] original_arr = Original.toCharArray();
        char[] Anagram_arr = Anagram.toCharArray();

        Arrays.sort(original_arr);
        Arrays.sort(Anagram_arr);

        return Arrays.equals(original_arr, Anagram_arr);
    }

    public static void main(String[] args) {
        System.out.println("Enter the original string");
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();
        System.out.println("enter the anagram to check");
        String Anagram = in.nextLine();
        Boolean result = IsEqual(original, Anagram);
        System.out.println("Result is " + result);
    }
}