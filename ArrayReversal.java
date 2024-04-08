public class ArrayReversal {

    /**
     * Recursive function to reverse an array in place.
     *
     * @param array The array of integers to be reversed.
     * @param start The starting index of the current subarray.
     * @param end   The ending index of the current subarray.
     */
    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end) {
            return; // Base case: when start index meets or exceeds end index
        }

        // Swap elements at start and end indices
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // Recursively reverse the subarray (excluding swapped elements)
        reverseArray(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        // Example usage:
        int[] array = {1, 4, 6, 2};
        int n = array.length;

        // Reverse the array using recursion
        reverseArray(array, 0, n - 1);

        // Output the reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
