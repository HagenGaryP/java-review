package ds.Lists;

import java.util.ArrayList;

/**
 When creating a new ArrayList, we define the data type of the elements inside the "less than" and "greater than" signs,
 followed by the variable name, and instantiate the constructor of the ArrayList class.
 For example, if we wanted to create an ArrayList of String elements, we would type the following:
    private ArrayList<String> groceryList = new ArrayList<String>();


 Normally, the functionality should be in the class where the ArrayList entries are being added.
 And by putting it all in this class, it's all self-contained and we're not exposing any extra functionality.
 Meaning, we're not letting other programmers or other parts of the program get access to the internal workings of the grocery list.

 Recall encapsulation from the object oriented programming parts of this course.
 This a practical example of why you wouldn't want to do that, and why you want to keep that all self-contained.
 The reason being that you can change out the implementation - in terms of the ArrayList you might decide to change this back
 to just a regular array or use another means of storing the collection of items.

 Using a normal array wouldn't change anything from the point of view of the people who are calling or accessing this class.

 */

public class GroceryList {
//    private int[] myNumbers = new int[50]; // if we were to make an array of ints with size 50.
    // ArrayLists do not need size specification since the java engine resizes it automatically.
    private ArrayList<String> groceryList = new ArrayList<String>(); // ArrayList without anything passed - empty constructor

    public void addGroceryItem(String item) {
        groceryList.add(item);  // ArrayList method to "add" and element to the ArrayList.
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // overloaded method
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // overloaded method
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    // overloaded method
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    // method to query grocery list and find an item
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem); // will return the index of searchItem if exists or -1 if item doesn't exist
    }

    // public method to use findItem - so we don't expose that method to the user
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }

        return false;
    }

    // original "findItem" method
//    public String findItem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem); // contains method returns true if value passed is found
//
//        // return the item back, if found/exists
//        int position = groceryList.indexOf(searchItem); // returns the index position of item or element passed in, or -1 if it doesn't exist
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }

    // grocerList GETTER method
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
