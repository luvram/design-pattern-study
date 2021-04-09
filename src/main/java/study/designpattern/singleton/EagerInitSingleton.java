package study.designpattern.singleton;

public class EagerInitSingleton {
    private static EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static EagerInitSingleton getInstance() {
        return instance;
    }
}
