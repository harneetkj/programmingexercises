/**
 * Swap two numbers by just using two variables
 */
public class Swap {
    public void swap(int a, int b) {
        System.out.println(a + "," + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "," + b);
    }
}