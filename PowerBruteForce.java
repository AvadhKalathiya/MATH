public class PowerBruteForce {

    public static long power(int x, int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        System.out.println(power(x, n));
    }
}