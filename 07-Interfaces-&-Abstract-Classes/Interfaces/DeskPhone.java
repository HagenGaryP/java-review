package oop.Interfaces;

/*****************          ACTUAL IMPLEMENTATION OF AN INTERFACE IS SHOWN HERE.        ******************
 *
 *
 * To implement an interface, use the "implements" keyword, followed by the interface name that you want to use.
 *
 * Initially, you will notice that intellij will show an error:
 *      "Class 'DeskPhone' must either be declared abstract or implement abstract method 'powerOn()' in 'ITelephone'"
 *
 * This error means that we need to start implementing some of these things in order for this to become a valid class.
 *
 * You can do this automatically by creating the basic method, by creating stubs for these methods (empty methods),
 * or you can type them manually.
 *
 */
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    // Constructor - just stores the actual number.
    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // implement by using intellij shortcut CTRL+I or the generate shortcut CMD+N and selecting Implement Methods
    // This will Override each of the methods.

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone doesn't have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        // check if phone is ringing
        if (isRinging) {
            System.out.println("Answering the desk phone.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // if phoneNumber is your correct number, set isRinging to true.  Else, set isRinging to false.
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring ring! Phone call! Phone call!"); // Pokemon reference :)
        } else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
