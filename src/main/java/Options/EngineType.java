package Options;

public enum EngineType{
    V8(4.0, 800),
    V12(8.0, 1000),
    AA(80.0, 3.50);
    private final double capacity;
    private final double value;
    EngineType(double capacity, double value){
        this.capacity = capacity;
        this.value = value;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public double getValue() { return this.value; }
}

