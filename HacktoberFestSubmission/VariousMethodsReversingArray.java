import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VariousMethodsReversingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Taking the array input
        System.out.print("Enter the size of the Array: ");
        int length = in.nextInt();

        Integer[] arr = new Integer[length];
        System.out.println("Now enter each and every element of the input array one by one");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the element at index (" + i + "): ");
            arr[i] = in.nextInt();
        }

        System.out.println("Reversing using the usingAnotherArray() method");
        usingAnotherArray(arr);
        System.out.println();

        System.out.println("Reversing using the swappingMirrorElements() method");
        swappingMirrorElements(arr);
        System.out.println();

        System.out.println("Reversing using the inBuiltFunction() method");
        inBuiltFunction(arr);
        System.out.println();
    }

    /* Storing the last element of the original array
     * in the start of the new array, hence end up reversing it. */
    public static void usingAnotherArray(Integer[] arr) {
        int length = arr.length;

        // creating another array
        int[] rev = new int[length];

        // using the above created array to store the reversed original array arr
        for (int i = 0; i < length; i++) {
            rev[i] = arr[length - i - 1];
        }

        // printing the array
        System.out.println(Arrays.toString(rev));
    }

    /* Swapping the mirror elements with each other with respect to the middle of the array */
    public static void swappingMirrorElements(Integer[] arr) {
        int length = arr.length, temp = 0;

        // swapping logic
        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        // printing the array
        System.out.println(Arrays.toString(arr));
    }

    /* Reversing the original array using inbuilt function */
    public static void inBuiltFunction(Integer[] arr) {

        // calling the reverse function from the collections class
        Collections.reverse(Arrays.asList(arr));

        // printing the array
        System.out.println(Arrays.toString(arr));
    }
}

/* Analysing each of the above mentioned Algorithms for reversing an Array
* 1. usingAnotherArray(Integer[] arr)
*            -> Time Complexity = O(n) i.e. linear time
*            -> Space Complexity = O(n) because we are creating another array of the same size as that of the original array
*             > This algorithm runs in linear time because we iterate over the whole array once.
* 2. swappingMirrorElements(Integer[] arr)
*            -> Time Complexity = O(n) i.e. linear time
 *           -> Space Complexity = O(1)
 *            > This algorithm reverses the array in actually less than O(n) time complexity because,
 *              we are running the loop only (n / 2) times but in Asymptotic notation it is considered to be O(n)
 *
 * 3. inBuiltFunction(Integer[] arr)
 *           -> Time Complexity = O(n) i.e. linear time
 *           -> Space Complexity = O(1)
 *            > The documentation for this method clearly specifies that this algorithm runs at linear time
 *
 * So the most efficient algorithm is in the swappingMirrorElements() method.
 * This is because the loop in the algorithm runs only n/2 times.
 * So it is actually less than O(n) but in Asymptotic notation it is considered to be O(n).
 * */
