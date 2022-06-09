import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;

import static org.junit.Assert.assertEquals;

public class BunTest {

    private final Database database = new Database();
    private Bun bun;

    @Before
    public void init() {
        bun = database.availableBuns().get(0);
    }

    @Test
    public void getBunNameTest() {
        String expected = "black bun";
        assertEquals(expected, bun.getName());
    }

    @Test
    public void getBunPriceTest() {
        float expected = 100;
        assertEquals(expected, bun.getPrice(), 0);
    }

}
