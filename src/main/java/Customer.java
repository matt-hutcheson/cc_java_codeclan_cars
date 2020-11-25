import cars.Car;

import java.util.ArrayList;

public class Customer {
    private double wallet;
    private ArrayList<Car> carCollection;

    public Customer(double wallet){
        this.wallet = wallet;
        this.carCollection = new ArrayList<>();
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Car> getCarCollection() {
        return carCollection;
    }

}
