/**********************************************      INHERITANCE     ***************************************************
 *
 * Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
 * With the use of inheritance the information is made manageable in a hierarchical order.
 *
 * The class which inherits the properties of other is known as subclass (derived class, child class)
 * and the class whose properties are inherited is known as superclass (base class, parent class).
 *
 * THE EXTENDS KEYWORD:
 * "extends" is the keyword used to inherit the properties of a class. Following is the syntax of extends keyword.
 *
 * SYNTAX:
 *
 * class Super {
 *    .....
 *    .....
 * }
 * class Sub extends Super {
 *    .....
 *    .....
 * }
 *
 * When creating a class with inheritance (subclassing) in mind,
 * you need to consider what properties they all have in common.
 *
 * For example, Create a new class called "Animal", then define its field properties.
 *
 * Afterwards, create another class called "Dog"
 *
 *
 *
 * The super keyword
 * The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used.
 *
 * It is used to differentiate the members of superclass from the members of subclass, if they have same names.
 *
 * It is used to invoke the superclass constructor from subclass.
 *
 *
 * Public methods on the Parent class are inherited by the subclass (the class extending from super/parent).
 * They do not need to be rewritten or defined in the subclass / child class.
 *
 * However, they can be overwritten by Overriding -
 * Best practice to use "@Override" to indicate that you're overriding a method from super class.
 *
 * When you Override a method, you can control whether it runs the super's method or that specific Class's method.
 *
 * Using the super keyword gives the subclass access to the methods on the super class,
 *
 *
 * Differentiating the Members:
 * If a class is inheriting the properties of another class.
 * And if the members of the superclass have the names same as the sub class,
 * to differentiate these variables we use super keyword as shown below.
 *
 * super.variable
 * super.method();
 *
 *
 ***********************************************************************************************************************
 *

 *
 */

package oop.inheritance;

public class Main {

    public static void main(String[] args) {

        // create animal class
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        // initialize a dog
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // Inheritance in action - The Dog class does not have the "eat" method, but Animal does.
        // However, since Dog extends Animal class, it has access to the parent class' public methods.
//        dog.eat();
//        dog.walk(); // output: Dog.walk() called! Animal is moving at a speed of 5
        dog.run(); // Dog.run() called! Dog.move() called! Dog.moveLegs() called!  Animal is moving at a speed of 10
    }
}
