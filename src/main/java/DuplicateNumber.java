import java.util.LinkedHashSet;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist.
 * find the duplicate one.
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        int[] arr = {1, 2, 3, 2, 4, 1};

        for (int i : arr) {

            if (set.contains(i)) {
                System.out.println("Following number is duplicate" + i);
            }
            set.add(i);

        }


    }


}

