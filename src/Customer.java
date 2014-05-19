public class Customer {

    public String eatPizzaWith(String meat) {
        Pizzahut pizzahut = new Pizzahut();
        PizzaMaker pizzaMaker = new PizzaMaker(meat);
        String pizza = pizzahut.getPizzaWith(pizzaMaker);
        return "I eat " + pizza + ".";
    }

}
