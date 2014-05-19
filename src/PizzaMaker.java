public class PizzaMaker {

    private final String meat;
    private Pizza pizza = new Pizza();

    public PizzaMaker(String meat) {
        this.meat = meat;
    }

    public void addDough() {
        pizza.setDough("dough");
    }

    public void addCheese() {
        pizza.setCheese("cheese");
    }

    public void addMeat() {
        pizza.setMeat(meat);
    }

    public String getPizza() {
        return pizza.getDough() + ", "
                + pizza.getCheese() + ", "
                + pizza.getMeat();
    }
}
