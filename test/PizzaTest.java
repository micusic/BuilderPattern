import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaTest {

    private Pizza pizza = new Pizza();

    @Before
    public void setUp() throws Exception {
        pizza.setDough("dough");
        pizza.setCheese("cheese");
        pizza.setMeat("meat");
    }

    @Test
    public void testPizza() throws Exception {
        assertEquals("dough", pizza.getDough());
        assertEquals("cheese", pizza.getCheese());
        assertEquals("meat", pizza.getMeat());
    }
}
