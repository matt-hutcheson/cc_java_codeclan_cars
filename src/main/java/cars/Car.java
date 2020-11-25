package cars;
import options.ICalculateValue;
import options.Options;

import java.util.ArrayList;


public abstract class Car implements ICalculateValue {
    private double price;
    private String make;
    private String model;
    private ArrayList<Options> options;

    public Car(double price, String make, String model) {
        this.price = price;
        this.make = make;
        this.model = model;
        this.options = new ArrayList<>();
    }

//    public double calculateValue() {
//
//    }
}
