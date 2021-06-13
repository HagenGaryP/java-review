package ds.Arrays;

import java.util.Scanner;

public class Main {

    // using scanner to accept input from the console/user for the exercise below
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // can use square brackets, [], after the data type to define an array of that type in Java
        int[] myIntArray = new int[10]; // the "new" keyword instantiates the array, assigning 10 elements that are ints
        // accessing array elements by using bracket notation with the index number passed in.
        myIntArray[5] = 50; // assigning the element at index 5 to the value 50.  (index 5 is the 6th element in the array)

        // shortcut for assigning multiple values to the array - must be done as you initialize the array.
        int[] anotherIntArray = { 1,2,3,4,5,6,7,8,9,10 };

        // can initialize an array with a for loop
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i*11;  // assigning each sequential element to the value of i times 10 on each iteration.
        }
        // calling the method to print out array's elements
//        printArray(myIntArray);

        // Exercise's Main code starts here
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element at index " + i + ": typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

//    // method to print the array
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("The element at index " + i + ", is " + array[i]);
//        }
//    }

    // Exercise: Accept some input from console/user, store values in array and sum the numbers.
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r"); // the \r is to make it go to the next line in console.
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt(); // scanner.nextInt() is a built in method to go to the next integer input by user.
        }
        return values;
    }

    // method to get the average
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length; // casting to double for the average
    }
}
