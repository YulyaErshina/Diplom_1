import org.junit.Before;
import org.junit.Test;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private final Database database = new Database();
    private Ingredient ingredient;

    @Before
    public void init() {
        ingredient = database.availableIngredients().get(0);
    }

    @Test
    public void getIngredientPriceTest() {
        float expected = 100;
        assertEquals(expected, ingredient.getPrice(), 0);
    }

    @Test
    public void getIngredientNameTest() {
        String expected = "hot sauce";
        assertEquals(expected, ingredient.getName());
    }

    @Test
    public void getIngredientTypeTest() {
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}
