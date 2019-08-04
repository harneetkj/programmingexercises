import java.util.Arrays;
import java.util.HashSet;

/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 */
public class Finding_Number {


    public static int find(int[] input) {
        Arrays.sort(input);
        int result = 0;
        HashSet<Integer> Newmap = new HashSet<Integer>();
        for (int i : input) {
            Newmap.add(i);
        }
        for (int i = 0; i <= input.length + 1; i++) {
            if (!Newmap.contains(i)) {
                result = i;
                System.out.println("Array is missing " + i);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] input = {3, 5, 2, 1};
        find(input);
    }
}
