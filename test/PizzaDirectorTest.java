import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaDirectorTest {

    private PizzaDirector pizzaDirector;

    @Before
    public void setUp() throws Exception {
        pizzaDirector = new PizzaDirector();
    }

    @Test
    public void serveChickenPizza() throws Exception {
        ChickenPizzaBuilder pizzaBuilder = new ChickenPizzaBuilder();
        pizzaDirector.getPizzaWith(pizzaBuilder);
        assertEquals("dough, cheese, chicken", pizzaBuilder.getPizza());
    }

    @Test
    public void serveBaconPizza() throws Exception {
        BaconPizzaBuilder pizzaBuilder = new BaconPizzaBuilder();
        pizzaDirector.getPizzaWith(pizzaBuilder);
        assertEquals("dough, cheese, bacon", pizzaBuilder.getPizza());
    }
}
