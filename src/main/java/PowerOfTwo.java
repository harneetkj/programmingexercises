/**
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 * Example 2:
 * <p>
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 * Example 3:
 * <p>
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo power = new PowerOfTwo();
        boolean result = power.isPower(16);
        System.out.println("IS the number power of 2?" + result);

    }

    public boolean isPower(int i) {
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        return i > 0 && Integer.bitCount(i) == 1;


    }


}
