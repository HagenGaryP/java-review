/*********************************************      CONSTRUCTORS      **************************************************
 *
 * A constructor in Java is a special method that is used to initialize objects.
 * The constructor is called when an object of a class is created - i.e., when instantiating using the "new" keyword.
 *
 *
 * General rule of thumb -
 * It is better to save the values of the constructor directly to the field rather than calling the setter.
 * This is because there could be scenarios where the code inside the setter isn't executed.
 *
 *
 * As you start writing more complex code, it's common to see multiple constructors.
 * In that situation, often you do all your initialization in the one constructor, as shown in Account.java class file,
 * and the other constructor should just call that major/main constructor.
 *
 * This often leads to cleaner and more succinct code, because you're not having to duplicate code
 * or duplicate initialization in more than one place.
 *
 *
 ***********************************************************************************************************************
 * CHALLENGE 1:
 *
 * Create a new class for a bank account.
 * Create fields for the account number, balance, customer name, email, and phone number.
 *
 * Create setters and getters for each field.
 * Create two additional methods:
 * 1) To allow the customer to deposit funds (should increment balance).
 * 2) To allow the customer to withdraw funds (decrement balance), but do not allow withdrawal if insufficient funds.
 *
 *
 ***********************************************************************************************************************
 *
 *
 *
 ***********************************************************************************************************************
 *

 *
 */
package oop.constructors;

public class Main {

    public static void main(String[] args) {
        // create a new account of the challenge by instantiating the Account class
        // be sure to pass the proper parameters into the class that are expected by the constructor.
        Account bobsAccount = new Account(
                "12345",
                0.00,
                "Bob Brown",
                "bBrown@gmail.com",
                "(631) 123-4567"
        );

        // printing the account number and balance using the getter methods
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance()); // initially 0.0

        // use the public methods on this account instance
        bobsAccount.deposit(200.0);
        bobsAccount.withdraw(100.0);

        // withdraw more than available balance
        bobsAccount.withdraw(101.0);

        // withdraw all remaining
        bobsAccount.withdraw(100.0);


        // Create a new account by calling the empty constructor
        Account johnsAccount = new Account();

        // create a new account using the constructor with only the name, email, and phone parameters
        Account timsAccount = new Account("Tim", "time@email.com", "12345");
        System.out.println(timsAccount.getNumber() + ", name: " + timsAccount.getCustomerName());

        System.out.printf("%n");
        /**
         * CHALLENGE 2:
         *
         * Create a new class VipCustomer.  It should have 3 fields: name, credit limit, and email.
         * Create 3 constructors: 1 empty that calls the constructor with 3 params with default values
         * 2nd constructor should pass on the 2 values it recieves and add a default value for the 3rd.
         * 3rd constructor should save all fields.
         *
         * create getters, but don't need setters.
         */

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 25.00);
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());
    }
}
