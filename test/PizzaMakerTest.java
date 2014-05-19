import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaMakerTest {
    @Test
    public void canGetPizzaWithChicken() throws Exception {
        String meat = "chicken";
        PizzaMaker pizzaMaker = new PizzaMaker(meat);
        pizzaMaker.addDough();
        pizzaMaker.addCheese();
        pizzaMaker.addMeat();
        assertEquals("dough, cheese, " + meat, pizzaMaker.getPizza());
    }

    @Test
    public void canGetPizzaWithBacon() throws Exception {
        String meat = "bacon";
        PizzaMaker pizzaMaker = new PizzaMaker(meat);
        pizzaMaker.addDough();
        pizzaMaker.addCheese();
        pizzaMaker.addMeat();
        assertEquals("dough, cheese, " + meat, pizzaMaker.getPizza());
    }
}
