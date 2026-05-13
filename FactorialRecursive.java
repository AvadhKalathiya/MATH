// Factorial using Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

public class FactorialRecursive {

    public static long factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(factorial(n));
    }
}