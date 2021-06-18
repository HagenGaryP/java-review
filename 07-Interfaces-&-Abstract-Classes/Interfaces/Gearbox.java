package oop.Interfaces;

public class Gearbox {

    private boolean clutchIsIn;

    // this is one way of implementing a particular method to check if clutch is in, but it's not exactly the best way of doing so.
    public void operateClutch(String inOrOut) {
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in"); // String method to check if it equals value, regardless of casing.
    }
    /**
     * For example, if we changed the expected data type of the operateClutch method to accept/expect a boolean,
     * the actual signature or this component of the public method has been changed.
     * So, if there is other code that is reliant on this parameter being a String, then the other code will essentially be broken.
     * This could be a serious problem if your code is used in a lot of other places, and it might not be recognized right away by other programmers.

     * The Interface is basically a commitment or contract that the method's signatures and variables (or constants) in the interface will not change.
     */
}
