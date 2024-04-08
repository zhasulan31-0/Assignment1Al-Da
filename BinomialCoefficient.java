public class BinomialCoefficient {

    /**
     * Recursive function to compute the binomial coefficient C(n, k).
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        // Base cases:
        if (k == 0 || k == n) {
            return 1; // C(n, 0) = C(n, n) = 1
        }

        // Recursive case:
        // C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 2;
        int k1 = 1;
        int n2 = 7;
        int k2 = 3;

        // Calculate binomial coefficients using recursion
        int result1 = binomialCoefficient(n1, k1);
        int result2 = binomialCoefficient(n2, k2);

        // Output the results
        System.out.println("C(" + n1 + ", " + k1 + ") = " + result1);
        System.out.println("C(" + n2 + ", " + k2 + ") = " + result2);
    }
}
