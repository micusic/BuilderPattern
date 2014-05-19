public class BaconPizzaBuilder implements PizzaBuilder{

    private Pizza pizza = new Pizza();

    @Override
    public void addDough() {
        pizza.setDough("dough");
    }

    @Override
    public void addCheese() {
        pizza.setCheese("cheese");
    }

    @Override
    public void addMeat() {
        pizza.setMeat("bacon");
    }

    @Override
    public String getPizza() {
        return pizza.getDough() + ", "
                + pizza.getCheese() + ", "
                + pizza.getMeat();
    }
}
