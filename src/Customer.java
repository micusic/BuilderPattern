public class Customer {

    public String eatPizzaWith(String meat) {
        return "I eat " +
                getPizzaWith(meat) +
                ".";
    }

    private String getPizzaWith(String meat) {
        return meat +
                ", cheese" +
                ", dough";
    }

}
