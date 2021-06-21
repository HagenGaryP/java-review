package oop.Interfaces;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    // Constructor - just stores the actual number.
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // implement by using intellij shortcut CTRL+I or the generate shortcut CMD+N and selecting Implement Methods
    // This will Override each of the methods.

    @Override
    public void powerOn() {
        System.out.println("Mobile phone powered on.");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is off.");
        }

    }

    @Override
    public void answer() {
        // check if phone is ringing
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        // if phoneNumber is your correct number, set isRinging to true.  Else, set isRinging to false.
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("You used to call me on my cell phone...");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is off and/or incorrect number.  Number called: " + phoneNumber + " and myNumber = " +myNumber);
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
