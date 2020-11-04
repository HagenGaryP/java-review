package oop.composition;

/**
 * This is composition.
 */

public class Computer {
    private Case computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case computerCase, Monitor monitor, Motherboard motherboard) {
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
