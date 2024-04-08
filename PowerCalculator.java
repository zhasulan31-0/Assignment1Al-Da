public class PowerCalculator {

    /**
     * Recursive function to calculate the power of a number.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n (a^n).
     */
    public static double power(double a, int n) {
        // Base case: a^0 = 1 for any non-zero a
        if (n == 0) {
            return 1;
        }

        // Recursive case: a^n = a * a^(n-1)
        if (n > 0) {
            return a * power(a, n - 1);
        } else {
            // If n is negative, compute a^(-n) = 1 / (a^n)
            return 1 / power(a, -n);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        double a = 2.0;
        int n = 10;

        // Calculate a^n using recursion
        double result = power(a, n);

        // Output the result
        System.out.println(a + "^" + n + " = " + result);
    }
}
