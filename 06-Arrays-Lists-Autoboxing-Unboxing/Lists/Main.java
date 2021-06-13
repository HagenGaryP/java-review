package ds.Lists;

import java.util.Scanner;

/*******************************         List and ArrayList: Part 1         ********************************************

 The List interface extends Collection and declares the behavior of a collection that stores a sequence of elements.

    * Elements can be inserted or accessed by their position in the list, using a zero-based index.

    * A list may contain duplicate elements.

    * In addition to the methods defined by Collection, List defines some of its own,
        which are summarized in the following table.

    * Several of the list methods will throw an UnsupportedOperationException if the collection cannot be modified,
        and a ClassCastException is generated when one object is incompatible with another.

 */
public class Main {

    private static Scanner s = new Scanner(System.in); // accepting console input
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] original = baseData; // taking a copy of original

        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
