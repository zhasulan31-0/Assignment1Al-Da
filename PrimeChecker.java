public class PrimeChecker {

    /**
     * Function to check if a number is prime.
     *
     * @param n The number to check.
     * @return "Prime" if the number is prime, "Composite" otherwise.
     */
    public static String checkPrime(int n) {
        if (n <= 1) {
            return "Composite"; // Numbers less than or equal to 1 are considered composite
        }

        // Check for divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "Composite"; // Found a divisor other than 1 and itself
            }
        }

        return "Prime"; // If no divisors other than 1 and itself were found, it's prime
    }

    public static void main(String[] args) {
        // Example usage:
        int n1 = 7;
        int n2 = 10;

        // Check if n1 is prime
        String result1 = checkPrime(n1);
        System.out.println(n1 + ": " + result1);

        // Check if n2 is prime
        String result2 = checkPrime(n2);
        System.out.println(n2 + ": " + result2);
    }
}
