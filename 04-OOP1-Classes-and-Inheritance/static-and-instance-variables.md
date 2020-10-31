# Static vs Instance Variables

## Static Variables

- Declared by using the keyword **static**

- **Static variables** are also known as **static member variables**

- Every instance of that class **shares** the same static variables.

- If changes are made to that variable, all other instances will see the effect of that change.


Static Variables are not used very often, but can sometimes be very useful.

For example, when reading user input using **Scanner** we will declare scanner as a static variable.
This way **static methods** can access it directly.

### Example of INCORRECTLY using the static variables
Showing how static variables are SHARED BETWEEN INSTANCES, and could give undesired results.
```
class Dog {
  // static member variable.
  private static String name;

  // constructor that sets the static variable (name) to the parameter value passed into it.
  public Dog(String name) {
    Dog.name = name; // notice "Dog.name = name;" for static.
                     // With instance variables we'd use the 'this' keyword (if var wasn't static)
  }

  public void printName() { // method printName() is not static
    System.out.println("name = " + name);
  }
}

public class Main {

  public static void main(String[] args) {

    Dog rex = new Dog("rex"); // create an instance of Dog class /instantiate Dog class with name = "rex"
    Dog fluffy = new Dog("fluffy"); // creates instance ("fluffy")

    rex.printName(); // prints "fluffy"
    fluffy.printName(); // prints "fluffy"
  }
}
```
So, as we see from the above code example - once we change the static variable, all instances will be changed.

Instantiating the class with "rex" makes a call on the Dog *Constructor*, which sets Dog.name = name; (Dog.name = "rex")
Doing this again with a new parameter, "fluffy" passed to Dog Constructor changes the static variable **private static String name;**
Meaning, name will be "fluffy" for ALL INSTANCES OF DOG CLASS.
They are still both instances of the Dog class, but are sharing the same name variable **because it is static**


## Instance Variables

- They **Do NOT** use the *static* keyword.

- Instance variables are also known as *fields* or *member variables*, and belong to a specific instance of a class.

- Every instance has its own copy of an instance variable and can have a different value (state)

- Instance variables **represent the state of an instance** of a class.


### Example of using Instance variables
Showing the instances, like above, but having different name variable values for each instance.
```
class Dog {

  private String name;

  // constructor that sets the static variable (name) to the parameter value passed into it, using 'this' keyword
  public Dog(String name) {
    this.name = name;
  }

  public void printName() { // method printName() is not static
    System.out.println("name = " + name);
  }
}

public class Main {

  public static void main(String[] args) {

    Dog rex = new Dog("rex"); // create an instance of Dog class /instantiate Dog class with name = "rex"
    Dog fluffy = new Dog("fluffy"); // creates instance ("fluffy")

    rex.printName(); // prints "rex"
    fluffy.printName(); // prints "fluffy"
  }
}
```
