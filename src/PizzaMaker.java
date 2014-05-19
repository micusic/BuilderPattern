public class PizzaMaker {

    private final String meat;

    public PizzaMaker(String meat) {
        this.meat = meat;
    }

    public String getPizza() {
        return meat + ", cheese, dough";
    }
}
