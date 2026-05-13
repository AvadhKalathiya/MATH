// Palindrome Number
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class PalindromeNumber {

    public static boolean isPalindrome(int n) {

        // Negative numbers are not palindrome
        if (n < 0) {
            return false;
        }

        int original = n;
        int reversed = 0;

        while (n > 0) {

            int digit = n % 10;

            reversed = reversed * 10 + digit;

            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        int n = 121;

        System.out.println(isPalindrome(n));
    }
}