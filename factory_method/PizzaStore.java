public abstract class PizzaStore{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);

        return pizza;
    }

    abstract Pizza createPizza(String type);
}