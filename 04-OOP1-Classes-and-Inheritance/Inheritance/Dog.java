package oop.inheritance;

public class Dog extends Animal {
    // Dog class specific field variables
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Make sure we have a constructor for the dog class that calls the other class it is extending from.

    // original constructor before modifying it so we don't force the programmer to define things like brain/body.
//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight); // super calls the constructor from the class we extended from.
//    }
    // adding dog's field vars as params to constructor, and removed vars that we don't force to be defined.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // notice the order of args passed to super - same order as Animal class constructor.
        super(name, 1, 1, size, weight); // super calls the constructor from the class we extended from.
        // initialize Dog specific fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // Private method for dogs
    private void chew() {
        System.out.println("Dog.chew() called!");
    }

    // Create an override method for Dog.eat() from Animal.eat()
    @Override // this reminds you that you are overriding something in the super class.
    public void eat() {
        System.out.println("Dog.eat() called!");
        chew(); // calling chew() method from our eat() method
        // super.eat allows us to call the method from the super class without the override.  It will run both.
        super.eat(); // executes Animal.eat() after Dog.eat() is finished running.
    }

    // using Animal.move() but also having specific movements for the Dog class
    public void walk() {
        System.out.println("Dog.walk() called!");
        // only use the "move" method in the super class -> Animal.move()
        super.move(5); // does not call the Dog.move() method - Calls Animal.move() instead, because of super
    }

    public void run() {
        System.out.println("Dog.run() called!");
        // without the super.move() it will execute whichever move it can find,
        // so if theres a move method on the Dog class, it will run that one.  If not it will execute the super one.
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called!");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called!");
        moveLegs(speed);
        super.move(speed);
    }
}
