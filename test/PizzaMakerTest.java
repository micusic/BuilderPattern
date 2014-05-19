import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaMakerTest {
    @Test
    public void canGetPizzaWithChicken() throws Exception {
        String meat = "chicken";
        assertEquals(meat + ", cheese, dough", new PizzaMaker(meat).getPizza());
    }

    @Test
    public void canGetPizzaWithBacon() throws Exception {
        String meat = "bacon";
        assertEquals(meat + ", cheese, dough", new PizzaMaker(meat).getPizza());
    }
}
