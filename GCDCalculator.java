public class GCDCalculator {

    /**
     * Recursive function to compute the GCD of two numbers using the Euclidean algorithm.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        // Base case:
        if (b == 0) {
            return a; // GCD(a, 0) = a
        }

        // Recursive case:
        // GCD(a, b) = GCD(b, a % b)
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Example usage:
        int a1 = 32;
        int b1 = 48;
        int a2 = 10;
        int b2 = 7;

        // Calculate GCD using recursion
        int gcd1 = gcd(a1, b1);
        int gcd2 = gcd(a2, b2);

        // Output the results
        System.out.println("GCD(" + a1 + ", " + b1 + ") = " + gcd1);
        System.out.println("GCD(" + a2 + ", " + b2 + ") = " + gcd2);
    }
}
