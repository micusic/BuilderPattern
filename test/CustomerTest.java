import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void canEatChickenPizza() throws Exception {
        assertEquals("I eat chicken, cheese, pizza.", new Customer().eatChickenPizza());
    }

    @Test
    public void canEatBaconPizza() throws Exception {
        assertEquals("I eat bacon, cheese, pizza.", new Customer().eatBaconPizza());
    }
}
