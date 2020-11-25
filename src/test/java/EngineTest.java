import Options.Engine;
import Options.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(EngineType.V12);
    }

    @Test
    public void engineHasCapacity() {
        assertEquals(8.0, engine.getType().getCapacity(), 0.01);
    }
    @Test
    public void engineHasValue() {
        assertEquals(1000, engine.getType().getValue(), 0.01);
    }
}
