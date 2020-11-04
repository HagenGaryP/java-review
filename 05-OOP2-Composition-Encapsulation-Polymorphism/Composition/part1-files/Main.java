/*************************************************    COMPOSITION   ****************************************************
 *
 * Composition deals with a "Has-A" relationship - which is essentially the class object's parts.
 *
 * If we look at the example of a computer, and consider what does a computer have?
 *
 * It "Has-A" motherboard, monitor, etc...
 *
 * A monitor "Has-A" resolution...  This is why we created a class whose type is used within the monitor classes field.
 *
 * This is composition.  So, the resolution class is part of a monitor.
 * The monitor isn't "a resolution", but it "Has-A" resolution.
 * So, we're saying that the resolution class is a component of a monitor.
 *
 *
 * As we continue with the example, we created the Case class, which "Has-A" dimensions field that we defined as a class.
 *
 * Then we will create another class that is comprised of the case, the monitor, and the motherboard.
 * We'll call this class Computer.
 *
 *
 *
 * USING THESE CLASSES:
 *
 * We created a Case, but this case needed the Dimensions class to be passed in as an argument.
 * Then we created an instance of a Monitor, which needed the Resolution class passed as arg.
 * Then, created an instance of a Motherboard.
 * Finally, created an instance of our Computer class, with the variables for case, monitor, and MB passed in.
 *
 * Once we had our computer, we were able to access methods indirectly,
 * by first getting the instance of the class we created and used its methods in basically a chaining fashion.
 *
 *
 ***********************************************************************************************************************
 *
 *
 */

package oop.composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case computerCase = new Case("220B", "Dell", "240", dimensions);
        // notice we are using an instance of the Resolution class, since we don't need a variable.  Done by using 'new' keyword
        Monitor computerMonitor = new Monitor("Beast", "acer", 27, new Resolution(2540, 1440));

        Motherboard computerMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        Computer myComputer = new Computer(computerCase, computerMonitor, computerMotherboard);

        // how do we access a method that isn't directly on our computer class?
        // We use the getMonitor method on our Computer class,
        // which returns the monitor - which is the class we initialized and created in the Computer class
        // so the computer obj is getting monitor, monitor obj has access to drawPixelAt method.
        myComputer.getMonitor().drawPixelAt(1500, 1200, "red");

        // access the loadProgram method, which is on the motherboard class
        myComputer.getMotherboard().loadProgram("Windows 10");

        // access the pressPowerButton() method that exists on the Case class
        myComputer.getComputerCase().pressPowerButton();

    }
}
