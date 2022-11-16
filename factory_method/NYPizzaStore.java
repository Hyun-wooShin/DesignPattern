public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            return new NYStyleClamPizza();
        } else {
            return null;
        }
    }
}
