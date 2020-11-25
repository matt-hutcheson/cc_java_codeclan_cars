package options;

public class Engine extends Options {
    private EngineType type;


    public Engine(EngineType type){
        this.type = type;
    }

    public EngineType getType(){
        return this.type;
    }
}
