import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenPizzaBuilderTest {
    @Test
    public void canGetPizzaWithChicken() throws Exception {
        ChickenPizzaBuilder pizzaBuilder = new ChickenPizzaBuilder();
        pizzaBuilder.addDough();
        pizzaBuilder.addCheese();
        pizzaBuilder.addMeat();
        assertEquals("dough, cheese, chicken", pizzaBuilder.getPizza());
    }
}
