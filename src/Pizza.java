public class Pizza {

    private final String meat;

    public Pizza(String meat) {
        this.meat = meat;
    }

    public String getPizza() {
        return meat + ", cheese, dough";
    }
}
