public class FastPowerRecursive {

    public static long power(long x, long n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call
        long half = power(x, n / 2);

        // Even exponent
        if (n % 2 == 0) {
            return half * half;
        }

        // Odd exponent
        return x * half * half;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 10;

        System.out.println(power(x, n));
    }
}