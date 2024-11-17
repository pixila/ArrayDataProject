package ArrayData;

public class MyArray {

    public static void main(String[] args) {
        // Declare and create an array of integers with 5 elements
        int[] numbers = new int[5];

        // Initialize the counter for the while loop
        int i = 0;

        // Use a while loop to populate the array with the values 0, 2, 4, 6, 8
        while (i < numbers.length) {
            numbers[i] = i * 2; // Multiply the index by 2 to get the desired sequence
            i++; // Increment the counter
        }

        // Print out the elements of the array using an enhanced for loop
        System.out.println("The elements of the array are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
