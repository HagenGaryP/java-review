package ds.LinkedList;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Gary", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer; // Java just saves the memory address of the customer variable, not instantiating the Customer class though.
        anotherCustomer.setBalance(12.18); // This will set the balance of both customer variables to 12.18, which may not be expected.
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        // ArrayList example to show how an ArrayList will add and shift elements, which can be complicated and intensive when dealing with big data.
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2); // doing this will require the ArrayList to make space and shift other elements accordingly

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }



    }
}
