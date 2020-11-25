package options;

public class Engine implements IGetValue {
    private EngineType type;

    public Engine(EngineType type){
        this.type = type;
    }

    public EngineType getType(){
        return this.type;
    }

    public double getValue(){
        return type.getValue();
    }
}
