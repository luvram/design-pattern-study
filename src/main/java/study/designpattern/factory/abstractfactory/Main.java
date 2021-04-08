package study.designpattern.factory.abstractfactory;


public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.createPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
