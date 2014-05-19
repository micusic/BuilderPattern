public class PizzaMaker {

    private final String dough = "dough";
    private final String cheese = "cheese";
    private final String meat;
    private String pizza = "";

    public PizzaMaker(String meat) {
        this.meat = meat;
    }

    public String getPizza() {
        return pizza;
    }

    public void addDough() {
        pizza += dough + ", ";
    }

    public void addCheese() {
        pizza += cheese + ", ";
    }

    public void addMeat() {
        pizza += meat;
    }
}
