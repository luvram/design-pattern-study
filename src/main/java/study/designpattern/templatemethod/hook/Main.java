package study.designpattern.templatemethod.hook;

public class Main {
    public static void main(String[] args) {
        CoffeeWithHook teaHook = new CoffeeWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n차 준비중...");
        teaHook.prepareRecipe();

        System.out.println("\n커피 준비중...");
        coffeeHook.prepareRecipe();
    }
}
