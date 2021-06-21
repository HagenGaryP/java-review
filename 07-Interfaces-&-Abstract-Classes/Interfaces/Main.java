package oop.Interfaces;

/**
 An interface, in Java terms, specifies which methods of particular class to be implemented, and that class implements the interface.
 The interface you create is abstract, meaning there's no actual code for methods, you only supply the actual method names and the parameters.
 The actual code still goes in the class that you're creating.

 But the idea is to use an interface to provide a common behavior that can be used by several classes by having them all implement the same interface.
 So it's really a way to standardize how a particular set of classes is used.


 *******    See "DeskPhone.java" file for the implementation of an interface.  ****

 To implement an interface, use the "implements" keyword, followed by the interface name that you want to use.

 Creating an instance of a class that implements an interface can by done by using the data type of the interface in the declaration.
 For example: INameOfInterface varName = new NameOfClass();

 */

public class Main {

    public static void main(String[] args) {
        // Create an instance of the DeskPhone class but using the specified interface as a data type.
        ITelephone garysPhone; // variable declared as ITelephone interface data type.  Can do both in one line, as followed:
//        ITelephone garysPhone = new DeskPhone(1234567); // instantiating the DeskPhone class with a phone number passed in.
        garysPhone = new DeskPhone(1234567);

        // calling some of the functions
//        garysPhone.powerOn();
//        garysPhone.callPhone(1234567);
//        garysPhone.answer();

        // setting phone variable to a cell, using MobilePhone class
        garysPhone = new MobilePhone(7654321);
        garysPhone.powerOn();
        garysPhone.callPhone(7654321);
        garysPhone.answer();
    }
}
