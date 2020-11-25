package cars;
import options.ICalculateValue;
import options.IGetValue;

import java.util.ArrayList;


public abstract class Car implements ICalculateValue {
    private double totalPrice;
    private double price;
    private String make;
    private String model;
    private ArrayList<IGetValue> options;

    public Car(double price, String make, String model) {
        this.price = price;
        this.make = make;
        this.model = model;
        this.options = new ArrayList<>();
        this.totalPrice = price;
    }

    public void calculateValue() {
        for (IGetValue option: options){
            this.totalPrice += option.getValue();
        }
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }
}
