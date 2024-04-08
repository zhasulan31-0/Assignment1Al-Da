public class Fibonacci {

    /**
     * Recursive function to find the n-th Fibonacci number.
     *
     * @param n The index of the Fibonacci number to find.
     * @return The n-th Fibonacci number.
     */
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0; // F(0) = 0
        } else if (n == 1) {
            return 1; // F(1) = 1
        } else {
            // Recursive case: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 5;
        int n2 = 17;

        // Calculate the n-th Fibonacci number using recursion
        int result1 = fibonacci(n1);
        int result2 = fibonacci(n2);

        // Output the results
        System.out.println("Fibonacci(" + n1 + ") = " + result1);
        System.out.println("Fibonacci(" + n2 + ") = " + result2);
    }
}
