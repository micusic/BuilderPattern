public class Customer {

    private final PizzaDirector pizzaDirector = new PizzaDirector();

    public String eatChickenPizza() {
        ChickenPizzaBuilder pizzaBuilder = new ChickenPizzaBuilder();
        String pizza = getPizza(pizzaBuilder);
        return eat(pizza);
    }

    public String eatBaconPizza() {
        BaconPizzaBuilder pizzaBuilder = new BaconPizzaBuilder();
        String pizza = getPizza(pizzaBuilder);
        return eat(pizza);
    }

    private String getPizza(PizzaBuilder pizzaBuilder) {
        pizzaDirector.getPizzaWith(pizzaBuilder);
        return pizzaBuilder.getPizza();
    }

    private String eat(String pizza) {
        return "I eat " + pizza + ".";
    }
}
