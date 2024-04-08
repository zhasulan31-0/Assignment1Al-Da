public class AverageCalculator {

    /**
     * Function to calculate the average of elements in an array of integers.
     *
     * @param n     The number of elements in the array.
     * @param array The array of integers.
     * @return The average of the elements in the array.
     */
    public static double calculateAverage(int n, int[] array) {
        if (n <= 0 || array == null || array.length != n) {
            throw new IllegalArgumentException("Invalid input: array size does not match n.");
        }

        int sum = 0;

        // Calculate sum of all elements in the array
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / n;

        return average;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] array = {3, 2, 4, 1};
        int n = array.length;

        // Call the function to calculate the average
        double average = calculateAverage(n, array);

        // Output the average
        System.out.println("Average: " + average);
    }
}
