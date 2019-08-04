import java.util.ArrayList;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 */
public class Fibonnaci {

    public int fibRecursiom(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        else return fibRecursiom(N - 1) + fibRecursiom(N - 2);

    }

    public int fibDP(int N) {
        ArrayList<Integer> store = new ArrayList<Integer>();
        store.add(0);
        store.add(1);
        if (N == 0) return 0;
        if (N == 1) return 1;
        else {
            for (int i = 2; i <= N; i++) {
                store.add(store.get(i - 1) + store.get(i - 2));
            }
            return store.get(N);
        }
    }
}
