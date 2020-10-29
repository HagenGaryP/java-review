package oop.inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish.rest() called!");

    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called!");

    }

    private void moveTail() {
        System.out.println("Fish.moveTail() called!");

    }

    private void swim(int speed) {
        System.out.println("Fish.swim() called!");
        moveMuscles();
        moveTail();
        super.move(speed);
    }
}
