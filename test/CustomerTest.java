import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void canEatChickenPizza() throws Exception {
        String meat = "chicken";
        assertEquals("I eat " + meat + ", cheese, dough.", new Customer().eatPizzaWith(meat));
    }

    @Test
    public void canEatBaconPizza() throws Exception {
        String meat = "bacon";
        assertEquals("I eat " + meat + ", cheese, dough.", new Customer().eatPizzaWith(meat));
    }
}
