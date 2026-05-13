// Factorial using Iteration
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Factorial {

    public static long factorial(int n) {

        // Edge case
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial = " + factorial(n));
    }
}