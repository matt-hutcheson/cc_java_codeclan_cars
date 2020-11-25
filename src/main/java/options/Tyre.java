package options;

public class Tyre extends Options {
    private String type;
    private double value;

    public Tyre(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
}
