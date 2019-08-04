import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static int[] check(int[] input, int sum) {
        Map<Integer, Integer> Newmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length; i++) {

            Newmap.put(input[i], i);
        }
        int difference = 0;
        int[] output = new int[2];
        for (int i : input) {
            difference = sum - i;
            if (Newmap.containsKey(difference) && Newmap.get(difference) != i) {
                output[0] = Newmap.get(difference);
                output[1] = i;
                System.out.println("result is" + output);

                return output;
            }

        }

        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String[] args) {
        int[] input = {5, 3, 4, 4, 1, 7};
        int sum = 8;
        check(input, sum);

    }
}