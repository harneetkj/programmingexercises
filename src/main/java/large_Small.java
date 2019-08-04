/**
 * Find smallest and largest in an array
 */
public class large_Small {

    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 1, 0, -5};
        int small = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < small) {
                small = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("smallest number is" + small);
        System.out.println("largest number is" + largest);
    }

}
