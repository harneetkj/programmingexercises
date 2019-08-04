/**
 * Check if a number is even or odd
 * First method is using modulos
 * second method is using bit operation
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();

        String res = obj.mod(3);
        System.out.println("result is" + res);
        obj.bit(6);

    }

    public String mod(int num) {
        if (num % 2 == 0) return "even";
        return "odd";
    }

    public String bit(int num) {
        if ((num & 1) == 0) return "even";
        return "odd";
    }
}
