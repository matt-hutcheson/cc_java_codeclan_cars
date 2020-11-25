package options;

public class Door implements IGetValue {
    Door door;

    private double value;
    public Door(){
        this.value = 50;
    }
    public double getValue(){
        return this.value;
    }
}
