public class Customer {

    public String eatPizzaWith(String meat) {
        PizzaMaker pizzaMaker = new PizzaMaker(meat);
        pizzaMaker.addDough();
        pizzaMaker.addCheese();
        pizzaMaker.addMeat();
        return "I eat " +
                pizzaMaker.getPizza() +
                ".";
    }

}
