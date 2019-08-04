import org.apache.commons.lang.ArrayUtils;

/**
 * Given an sorted array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist.
 * find the duplicate one.
 */

public class Duplicate_sorted {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("Element removed is" + arr[i]);
                arr = ArrayUtils.remove(arr, i);
            }
        }
        System.out.println("new length of array is " + arr.length);
    }
}
