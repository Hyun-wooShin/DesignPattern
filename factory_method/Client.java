public class Client {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyCheesePizza =  nyStore.orderPizza("cheese");
        nyCheesePizza.prepare();
        nyCheesePizza.bake();
        nyCheesePizza.box();

        Pizza nyClamPizza = nyStore.orderPizza("clam"); 
        nyClamPizza.prepare();
        nyClamPizza.bake();
        nyCheesePizza.box();

    }
}
