import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place.
 */

public class Repeated_Chars {

    public static void Unique(String s) {
        char[] arr_char = s.toCharArray();
        //building an hashmap to keep track of number of times a char ex
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for (Character ch : arr_char) {
            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch) + 1);
            } else {
                hashmap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = hashmap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("char is : " + entry.getKey());
                System.out.printf("  %d", entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
        Unique(s);
    }
}
