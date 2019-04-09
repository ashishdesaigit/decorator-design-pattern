public class FreshTomato extends PizzaToppingDecorator {

    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", FreshTomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
