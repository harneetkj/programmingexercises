import java.util.Arrays;
import java.util.Collections;

/*Given an input string, reverse the string word by word.

 */
public class ReverseString {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +"); /*Regular expression to describe one or more spaces*/
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
