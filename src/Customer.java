public class Customer {

    public String eatPizzaWith(String meat) {
        return "I eat " +
                new Pizza(meat).getPizza() +
                ".";
    }

}
