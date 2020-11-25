package Options;

public enum EngineType{
    V8(4.0),
    V12(8.0),
    AA(80.0),
    GASPOWEREDAAA(8.1);
    private final double capacity;
    EngineType(double capacity){
        this.capacity = capacity;
    }
    public double getCapacity(){
        return this.capacity;
    }
}

