public class FibonacciRecursive {

    public static int fibonacci(int n) {

        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println("Fibonacci = " + fibonacci(n));
    }
}