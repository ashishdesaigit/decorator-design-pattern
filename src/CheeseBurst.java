public class CheeseBurst  extends PizzaToppingDecorator{

    Pizza pizza;

    public CheeseBurst(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 35;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "," + "Cheese";
    }
}
