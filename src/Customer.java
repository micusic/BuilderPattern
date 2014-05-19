public class Customer {

    public String eatPizzaWith(String meat) {
        return "I eat " +
                new PizzaMaker(meat).getPizza() +
                ".";
    }

}
