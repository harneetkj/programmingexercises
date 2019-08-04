import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Check if a string contains a digit
 * Return true, if it does.
 */
public class NumberCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter to check if string is number");
        String input = in.nextLine();
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        System.out.println("does " + input + " is number : "
                + !pattern.matcher(input).matches());
    }
}
