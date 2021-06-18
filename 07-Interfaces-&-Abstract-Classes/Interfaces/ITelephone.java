package oop.Interfaces;

/**
 * By convention, interfaces will be named starting with "I" and followed by the name you want to call the interface.
 * This let's other developers know it is an interface and not a class.
 */

public interface ITelephone {
    // We want to define the methods used in this interface, that the class which implements this interface needs.

    // The following are what is known as "the signature" - they have the name, return type, and any parameters they expect.  The actual code still goes into the class that inherits the interface.
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
    // so the above code is the signature that contains the methods that the class has to implement.
    // Essentially, this defines the contract for the methods, between the class and the interface or the params and return types,
    // The contract specifies the actual parameters and return types that are valid for each method, and in turn make the class valid.

}
