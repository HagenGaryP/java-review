package ds.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    // print Instructions method
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To process the list.");
        System.out.println("\t 7 - To quit the application.");
    }

    // method to add item to grocery list
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // method to modify an item
    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    // method to remove an item
    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNum = scanner.nextLine();
        groceryList.removeGroceryItem(itemNum);
    }

    // method to search for an item
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    // process ArrayList - Copying the ArrayList
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        // another way of making the ArrayList copy by passing the original to the ArrayList constructor to initialize it.
        ArrayList<String> anotherArray = new ArrayList<String>(groceryList.getGroceryList());

        // converting the ArrayList to an Array of string elements
        String[] myArray = new String[groceryList.getGroceryList().size()]; // to get the correct size of the ArrayList
        myArray = groceryList.getGroceryList().toArray(myArray);
        /**
         * The getter method, getGrocerList(), returns an ArrayList of strings in our example.
         * Then, the ArrayList class method, with syntax of "toArray(T[] a)", is used to convert to a regular Array.
         * Where "T" represents the runtime type of the array to contain the collection, and "a" represents The array into which
         * the elements of the list are to be stored, if it is big enough;
         * otherwise, a new array of the same runtime type is allocated for this purpose.


         * The toArray() method is used to get an array which contains all the elements in an ArrayList object
         * in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
         * If the list fits in the specified array, it is returned therein.
         * Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list.
         */
    }
}
