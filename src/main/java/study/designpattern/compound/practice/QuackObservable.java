package study.designpattern.compound.practice;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();

}
