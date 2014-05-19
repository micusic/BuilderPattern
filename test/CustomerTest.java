import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void canEatChickenPizza() throws Exception {
        assertEquals("I eat dough, cheese, chicken.", new Customer().eatChickenPizza());
    }

    @Test
    public void canEatBaconPizza() throws Exception {
        assertEquals("I eat dough, cheese, bacon.", new Customer().eatBaconPizza());
    }
}
