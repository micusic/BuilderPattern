public class Pizzahut {

    public String getPizzaWith(PizzaMaker pizzaMaker) {
        pizzaMaker.addDough();
        pizzaMaker.addCheese();
        pizzaMaker.addMeat();
        return pizzaMaker.getPizza();
    }
}
