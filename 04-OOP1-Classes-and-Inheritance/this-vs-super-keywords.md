# The 'this' keyword vs the 'super' keyword

The keyword **super** is used to access/call the parent class members (variables and methods).

The keyword **this** is used to call the current class members (variables and methods).
This is required when we have a parameter with the same name as an instance variable (field).


NOTE: We can use both of them anywhere in a class, except static areas (the static block or a static method).
<t> Any attempt to do so will lead to compile-time errors.


## Keyword this

The keyword **this** is commonly used with **constructors** and **setters**, and optionally in getters.

In the example below, we are using the **this** keyword in the **constructor** and **setter** since
there is a parameter with the same name.
In the getter we don't have any parameters so the **this** keyword is optional.
```
class House {
  private String color;

  public House(String color) {
    // this keyword is required, same parameter name as field.
    this.color = color;
  }
  public String getColor() {
    // this keyword is optional
    return color; // same as return this.color;
  }
  public void setColor(String color) {
    // this keyword is required, same parameter as field
    this.color = color;
  }
}
```

## Keyword super

The keyword **super** is commonly used with **method overriding**, when we call a method
with the same name from the parent class.

In the example below, we have a method printMethod that calls super.printMethod();
```
class SuperClass { // parent class, aka super class
  public void printMethod() {
    System.out.println("Printed in SuperClass.");
  }
}

class SubClass extends SuperClass { // subclass, aka child class
  // overrides method from parent
  @Override
  public void printMethod() {
    super.printMethod(); // calls method in SuperClass (parent)
    System.out.println("Printed in SubClass.");
  }
}

class MainClass {
  public static void main(String[] args) {
    Subclass s = new subClass();
    s.printMethod();
  }
}
```
In other words, it is calling the method with the same name from the parent class.
Without the keyword **super** in the above case, it would be a recursive call,
and the method would continue calling itself forever (or until memory is fully used).
That is why the **super** keyword is needed.

## this() vs super() call

In Java we have the **this()** call and the **super()** call.
Notice the braces - it is known as a call since it looks like a regular method call.

Use **this()** to call a constructor from another overloaded constructor in the same class.

The call to **this()** can be used only in a constructor, and it must be the 1st statement in a constructor.
It is used with constructor chaining.
In other words, when one constructor calls another constructor, and helps to reduce duplicated code.

The only way to call a parent constructor is by calling **super()**

The Java compiler puts a default call to **super()** if we don't add it,
and it is always the no-args **super** which is inserted by the compiler (constructor without arguments).

The call to **super()** must be the first statement in each constructor.

Even Abstract classes have constructors, although you can never instantiate an abstract class using the **new** keyword.

An Abstract class is still a **super** class, so its constructors run when someone makes an instance of a concrete subclass.

NOTE: A constructor can have a call to either **super()** or **this()**, but NEVER BOTH.

## Constructor Chaining
In the code below, we have an example of how to write multiple constructors properly, by constructor chaining.
This avoids having to duplicate code.
```
class Rectangle {
  private int x;
  private int y;
  private int width;
  private int height;

  // 1st constructor
  public Rectangle() {
    this(0, 0); // calls 2nd constructor
  }

  // 2nd constructor
  public Rectangle(int width, int height) {
    this(0, 0, width, height); // calls 3rd constructor
  }

  // 3rd constructor
  public Rectangle(int x, int y, int width, int height) {
    // initialize variables
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
}
```
In the above example, we have 3 constructors.
The 1st constructor calls the 2nd, the 2nd calls the 3rd, and the 3rd constructor initializes the instance variables.
So, the 3rd constructor is really doing all the work.
No matter what constructor we call, the variables will always be initialized in the 3rd constructor.
This is known as **constructor chaining**, the last constructor has the "responsibility" to initialize the variables.


## super() call example
In the example below, we have a class "Shape" with 'x' and 'y' variables,
and a class "Rectangle" that extends "Shape", with variables 'width' and 'height'.
```
class Shape {
  private int x;
  private int y;

  public Shape(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Rectangle extends Shape {
  private int width;
  private int height;

  // 1st constructor
  public Rectangle(int x, int y) {
    this(x, y, 0, 0); // calls 2nd constructor
  }

  // 2nd constructor
  public Rectangle(int x, int y, int width, int height) {
    super(x, y); // calls constructor from parent (Shape)
    this.width = width;
    this.height = height;
  }
}
```
In Rectangle, the 1st constructor is calling the 2nd constructor.
The 2nd constructor calls the parent constructor with parameters 'x' and 'y' by using **super(x, y);**
The parent constructor will initialize 'x' and 'y' variables
while the 2nd Rectangle constructor will initialize the 'width' and 'height' variables.
The example uses both **super()** and **this()** calls, which is okay in separate constructors.
