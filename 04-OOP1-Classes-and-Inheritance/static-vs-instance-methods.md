# Static Methods & Instance Methods

## Static Methods

**Static Methods** are declared using a **static** modifier.

They **cannot** access instance methods and instance variables directly.

They are usually used for operations that don't require any data from an instance of the class (from 'this').
Because the 'this' keyword is the current instance of a class.

So, in **static methods** we can't use the **this** keyword.

Whenever you see a method that **does not use instance variables**, it should be declared as a **static method**

For example, main is a static method, and it is called by the Java Virtual Machine (JVM) at start of application.


You should use static methods whenever,
- The code in the method is not dependent on instance creation and is not using any instance variable.
- A particular piece of code is to be shared by all the instance methods.
- The definition of the method should not be changed or overridden.
- you are writing utility classes which should not be changed.


### Static Methods Example
**static methods** are called in the form of **ClassName.methodName();**
or by just the method name if it is in the same class -> **methodName();** to invoke/call method.
```
class Calculator {
  // a public static method that allows for use outside of this class

  public static void printSum(int a, int b) {
    System.out.println("sum= " + (a + b));
  }
}

public class Main {

  public static void main (String[] args) {

    Calculator.printSum(5, 10); // doesn't require instance of class, i.e., "Calculator calc1 = new Calculator();"

    printHello(); // shorter form of "Main.printHello();"
  }

  public static void printHello() {
    System.out.println("Hello");
  }
}
```


## Instance Methods

**Instance methods** belong to an instance of a class.

To use them, we have to *instantiate* the class first, usually by using the **new** keyword.

They can access instance methods & variables directly, and can also access static methods/variables directly.

### Instance Methods Example
```
class Dog {
  public void bark() {
    System.out.println("woof");
  }
}

public class Main {

  public static void main(String[] args) {

    Dog rex = new Dog(); // create an instance of Dog class (instantiate Dog class)

    rex.bark(); // call instance method
  }
}
```

### When to use a static method or an instance method
Instance methods are created more often than static methods, but when should a method be static?
- If your method is **NOT** using any fields (instance variables) or instance methods, it should probably be a **static method**.

If the method uses instance variables/methods, then the method should probably be an instance method





### Static vs Instance methods
In Java as we know that the behavior of any variable/method is defined by the keyword that is used in front of its declaration name.
So one of the *non-access modifiers* is **Static**, which can be used along with method as well as with variable.

**Static methods** as name states defined at the class level and could be accessed on the class name,
 i.e no need of class object creation in order to access/call the static methods.

While on another hand if we do not uses the static keyword with variable/method than it belongs or categorized as an **instance method**,
which is **defined at instance level and need class object for their accessibility**.

Also static methods exist as a single copy for a class,
while instance methods exist as multiple copies depending on the number of instances created for that particular class.

Static methods can't access instance methods/variables directly,
while instance methods can access static variables and static methods directly.
