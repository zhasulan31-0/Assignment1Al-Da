public class MinElementFinder {

    public static void main(String[] args) {
        // Example usage:
        int[] array = {10, 1, 32, 3, 45};
        int n = array.length;

        // Call the function to find the minimum element
        int min = findMinElement(n, array);

        // Output the minimum element
        System.out.println("Minimum element: " + min);
    }

    /**
     * Function to find the minimum element in an array of integers.
     *
     * @param n     The number of elements in the array.
     * @param array The array of integers.
     * @return The minimum element in the array.
     */
    public static int findMinElement(int n, int[] array) {
        // Check if the array is empty or null (optional)
        if (n == 0 || array == null) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        // Initialize min with the first element of the array
        int min = array[0];

        // Iterate through the array to find the minimum element
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
