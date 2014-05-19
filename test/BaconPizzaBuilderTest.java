import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaconPizzaBuilderTest {
    @Test
    public void canGetBaconPizza() throws Exception {
        BaconPizzaBuilder pizzaBuilder = new BaconPizzaBuilder();
        pizzaBuilder.addDough();
        pizzaBuilder.addCheese();
        pizzaBuilder.addMeat();
        assertEquals("dough, cheese, bacon", pizzaBuilder.getPizza());
    }
}
