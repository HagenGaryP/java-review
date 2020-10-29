package oop.constructors;

/**
 * Calling a constructor from another constructor.
 * In this scenario, if the empty constructor is called, we want to actually call the constructor with default values.
 */
public class Account {
    // FIELD VARIABLES
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Create Constructor for the class - this one is an optional DEFAULT constructor, just in case instantiated without params
    public Account() {
        // special case of the word "this"
        this("01234", 0.00, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called"); // only called once when instantiated.
    }

    // Create another constructor with parameters.  Like methods, constructors too can be overloaded.
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        // set the instance's field variables directly, and do NOT use the setters inside constructor.
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Create a constructor that allows only a few of the values passed in, and rest as default.  Using Generate
    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
            // created from IntelliJ's Generate - but we used them inside of the constructor above, using "this"
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    // DEPOSIT METHOD
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + ".  Current balance is $" + this.balance);
    }

    // WITHDRAW METHOD
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ".  Current balance is $" + this.balance);
        } else {
            System.out.println("INSUFFICIENT FUNDS: Could not withdraw $" + amount + ". Your balance is only $" + this.balance);
        }

    }

    /**
     * Using "GENERATE" to have IntelliJ IDEA create setters and getters for you:
     *  (for mac) click on code tab at the top, then click Generate... (shortcut = cmd+N),
     *  then click getter and setter (both), then select the fields you want.
     */
    // Getters and Setter methods - created by the generator
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
