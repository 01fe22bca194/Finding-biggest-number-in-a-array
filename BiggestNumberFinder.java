/**
 * The BiggestNumberFinder class finds the largest number in an array of integers.
 */
public class BiggestNumberFinder {
    
    public static int findBiggestNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int max = arr[0]; // Assume first element is the max
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 25};
        int biggestNumber = findBiggestNumber(array);
        System.out.println("The biggest number in the array is: " + biggestNumber);
    }
}
