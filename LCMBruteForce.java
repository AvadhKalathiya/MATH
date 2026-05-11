public class LCMBruteForce {

    public static int lcm(int a, int b) {

        int max = Math.max(a, b);

        while (true) {

            if (max % a == 0 && max % b == 0) {
                return max;
            }

            max++;
        }
    }

    public static void main(String[] args) {

        int a = 4;
        int b = 6;

        System.out.println("LCM = " + lcm(a, b));
    }
}