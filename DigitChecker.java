public class DigitChecker {

    /**
     * Recursive function to check if a string consists only of digits.
     *
     * @param s The input string to be checked.
     * @return true if the string consists only of digits, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        return isAllDigitsRecursive(s, 0);
    }

    /**
     * Recursive helper function to check if a string consists only of digits.
     *
     * @param s     The input string to be checked.
     * @param index The current index in the string.
     * @return true if the string consists only of digits from the current index onward, false otherwise.
     */
    private static boolean isAllDigitsRecursive(String s, int index) {
        // Base case: reached end of string, return true
        if (index == s.length()) {
            return true;
        }

        // Get the character at the current index
        char ch = s.charAt(index);

        // Check if the character is a digit (0-9)
        if (ch >= '0' && ch <= '9') {
            // Recursively check the rest of the string
            return isAllDigitsRecursive(s, index + 1);
        } else {
            // If the character is not a digit, return false
            return false;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "123456";
        String s2 = "123a12";

        // Check if s1 consists only of digits
        boolean result1 = isAllDigits(s1);
        System.out.println(s1 + " : " + (result1 ? "Yes" : "No"));

        // Check if s2 consists only of digits
        boolean result2 = isAllDigits(s2);
        System.out.println(s2 + " : " + (result2 ? "Yes" : "No"));
    }
}
