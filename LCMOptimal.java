public class LCMOptimal {

    // GCD Function
    public static int gcd(int a, int b) {

        while (b != 0) {

            int remainder = a % b;

            a = b;
            b = remainder;
        }

        return a;
    }

    // LCM Function
    public static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        int a = 4;
        int b = 6;

        System.out.println("LCM = " + lcm(a, b));
    }
}