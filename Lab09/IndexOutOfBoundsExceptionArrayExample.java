
public class IndexOutOfBoundsExceptionArrayExample {
    public static void main(String[] args) {
        // Create an array with three elements
        int[] numbers = {10, 20, 30};

        try {
            // Attempt to access an invalid index (e.g., index 5)
            System.out.println("Accessing element at index 5: " + numbers[5]); // This will throw IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an invalid index in the array.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}