package study.designpattern.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.createPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
