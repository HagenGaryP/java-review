/*********************************************      Classes       ******************************************************
 *
 * Classes are objects that can be a user defined data type, and lend themselves to keeping code DRY.
 *
 * First, what is an "object" in regard to object-oriented programming terms?
 * Software objects store their stat in fields, known as variables, and expose their behavior with methods.
 *
 * For classes, think of a class as a template or blueprint for creating objects.
 *
 * Creating a new class in your project (with IntelliJ IDEA):
 *      click on your project panel, click the dropdown of your project folder name,
 *      then click the dropdown for your source folder (src) which should show the package name.
 *      Right click the package name, select 'new', select 'java class', then name your class.
 *      This will create a new file/class.
 *
 *
 * Looking at the Car.java file, you'll notice IntelliJ IDEA automatically created the class and extended from package.
 *
 * Remember, "public", "class" and "package" are Java keywords.
 *
 * The "public" keyword is an access modifier, used to determine if we want to allow access to this class.
 * So, the word "public" means unrestricted access to the class, which is common when initially learning classes.
 *
 *
 * Keep in mind, that the variables used inside of a method, local variables, can only be used in that method.
 *
 *
 * Classes allow us to create variables that can be used/accessed from anywhere within the class.
 *
 * These are known as "class variables" or "member variables", but are most commonly referred to as "fields".
 * Fields are variables that are actually the STATE COMPONENT for a Car class.
 *
 * When creating these "fields", you must also specify an access modifier.
 * As a general rule, when defining fields in a java class, you use the "private" access modifier.
 *
 * So, in regard to fields, "private" keyword is adhering to ENCAPSULATION by hiding fields from being accessed publicly.
 *
 * This means that the internal representation of an object is going to be hidden from view outside the object's definition.
 *
 *
 ***********************************************************************************************************************
 ***********************************************************************************************************************
 *
 *              Java access modifiers: "default", "private", "protected", and "public"
 *
 ***********************************************************************************************************************
 *
 * 1) Default access modifier - When we do not mention any access modifier, it is called default access modifier.
 *      The scope of this modifier is limited to the package only.
 *      This means that if we have a class with the default access modifier in a package,
 *      only those classes that are in this package can access this class.
 *      No other class outside this package can access this class.
 *      Similarly, if we have a default method or data member in a class,
 *      it would not be visible in the class of another package.
 *
 * 2) Private access modifier - The scope of private modifier is limited to the class only.
 *      a) Private Data members and methods are only accessible within the class.
 *      b) Class and Interface cannot be declared as private.
 *      c) If a class has private constructor then you cannot create the object of that class from outside of the class.
 *
 * 3) Protected Access Modifier - Protected data member and method are only accessible by the classes of
 *      the same package and the subclasses present in any package.
 *      You can also say that the protected access modifier is similar to default access modifier
 *      with one exception that it has visibility in sub classes.
 *      Classes cannot be declared protected.
 *      This access modifier is generally used in a parent child relationship.
 *
 * 4) Public access modifier - The members, methods and classes that are declared public can be accessed from anywhere.
 *      This modifier does not put any restriction on the access.
 *
 ***********************************************************************************************************************
 ***********************************************************************************************************************
 *
 *
 */
package oop.classes;

public class Main {

    public static void main(String[] args) {
        // creating a new instance of Car - they're objects that were instantiated with the "new" keyword on the class.
        Car bmw = new Car();

        // accessing the variables outside of the actual Car class
        // bmw.model = "435i"; // this would not work because we dont have access to the class's "private" field vars.

        // instead, we can make a public method (setter method) to set the model, and this method could be accessed here.
        bmw.setModel("435i");

        // using the GETTER METHOD from Car class;
        System.out.println("Model is " + bmw.getModel());

    }
}
