import Options.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre("Snow", 149.99);
    }

    @Test
    public void canGetTyreType() {
        assertEquals("Snow", tyre.getType());
    }

    @Test
    public void canGetValue() {
        assertEquals(149.99, tyre.getValue(), 0.01);
    }
}
