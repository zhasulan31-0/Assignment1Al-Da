public class FactorialCalculator {

    /**
     * Recursive function to calculate the factorial of a number.
     *
     * @param n The number for which factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 5;

        // Calculate factorial of n using recursion
        int result = factorial(n);

        // Output the result
        System.out.println(n + "! = " + result);
    }
}
