package study.designpattern.factory.factorymethod;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NyStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NyStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NyStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
