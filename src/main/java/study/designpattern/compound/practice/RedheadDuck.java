package study.designpattern.compound.practice;

public class RedheadDuck implements Quackable {
    private Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RedheadDuck";
    }
}
