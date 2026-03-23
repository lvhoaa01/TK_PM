package creational.factory;

abstract class PizzaStore {
    abstract Pizza createPizza();
    void order(){
        Pizza pizza = createPizza();
        pizza.print();
    }
}


class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(){
        return new SausagePizza();
    }
}

class ChicagoPizza extends PizzaStore{
    @Override
    public Pizza createPizza(){
        return new MozzarellaPizza();
    }
}
