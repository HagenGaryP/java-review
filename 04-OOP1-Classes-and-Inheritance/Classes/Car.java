package oop.classes;

public class Car {

    // FIELDS - These variables are actually the STATE COMPONENT for a Car class.  They are defaulted to null.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // SETTER METHODS - a public method, that can be accessed outside of this class.
    public void setModel(String model) {
        // how do we distinguish between the field/state variable "model" and the argument passed, named "model" as well?
        // The keyword "this" refers to the class object, and gives us access to the fields
        // so, "this.model" would be accessing the field variable, and just "model" would be the variable from the param

        // VALIDATION - setting what what is valid or not valid.
        String validModel = model.toLowerCase();
        if (validModel.equals("435i") || validModel.equals("440i")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // GETTER METHODS - public method that returns the value wanted
    public String getModel() {
        return this.model;
    }
}
