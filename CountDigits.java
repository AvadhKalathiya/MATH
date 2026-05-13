// Count Digits in a Number
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class CountDigits {

    public static int countDigits(int n) {

        // Edge case
        if (n == 0) {
            return 1;
        }

        int count = 0;

        n = Math.abs(n);

        while (n > 0) {

            count++;

            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 12345;

        System.out.println("Digits = " + countDigits(n));
    }
}