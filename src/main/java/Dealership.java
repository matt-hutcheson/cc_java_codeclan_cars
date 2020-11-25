import cars.Car;
import options.ICalculateValue;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<ICalculateValue> stock;
    private double till;


    public Dealership(double till){
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public ArrayList<ICalculateValue> getStock() {
        return stock;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public double getTill() {
        return till;
    }

    public ICalculateValue getCar(int index){
        return stock.get(index);
    }

    public void sellCar(Customer customer, ICalculateValue car){
        this.till -= car.getTotalPrice();
    }

}
