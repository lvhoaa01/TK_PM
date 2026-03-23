package creational.factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizza = new ChicagoPizza();
        pizza.order();
    }
}
