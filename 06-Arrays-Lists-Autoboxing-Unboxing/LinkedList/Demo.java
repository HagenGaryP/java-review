package ds.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    // Typing "psvm" is an Intellij shortcut to create a main method inside your class.
    public static void main(String[] args) {
        // creating a LinkedList with Australian cities.
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        // adding another element to the LinkedList - this changes Sydney's next pointer to Alice Springs, which points to Melbourne.
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        // removing will do the same mechanism of changing pointers to adjust for changes.
        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    // printList method
    private static void printList(LinkedList<String> linkedList) {
        // ".iterator()" method, built in to LinkedList class.
        Iterator<String> i = linkedList.iterator();

        // while the linkedList has a next entry.  Using the ".hasNext()" method on the Iterator class.
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next()); // ".next()" method actually goes to the next value itself.
        }
        System.out.println("---------------------------");
    }
}
