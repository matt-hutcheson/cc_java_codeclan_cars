package Options;

public class Engine extends Options implements IHaveValue{
    private EngineType type;


    public Engine(EngineType type){
        this.type = type;
    }

    public EngineType getType(){
        return this.type;
    }
}
