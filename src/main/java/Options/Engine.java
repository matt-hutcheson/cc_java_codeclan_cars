package Options;

public class Engine extends Options implements IHaveValue{
    private String type;
    private double capacity;

    public Engine(String type, double capacity){
        this.type = type;
        this.capacity = capacity;
    }
}
