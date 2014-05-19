import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzahutTest {

    private Pizzahut pizzahut;

    @Before
    public void setUp() throws Exception {
        pizzahut = new Pizzahut();
    }

    @Test
    public void serveChickenPizza() throws Exception {
        assertEquals("dough, cheese, chicken", pizzahut.getPizzaWith(new PizzaMaker("chicken")));
    }

    @Test
    public void serveBaconPizza() throws Exception {
        assertEquals("dough, cheese, bacon", pizzahut.getPizzaWith(new PizzaMaker("bacon")));
    }
}
