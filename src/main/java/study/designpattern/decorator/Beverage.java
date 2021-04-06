package study.designpattern.decorator;

// decorator 패턴은 interface를 사용하는 편이 더 좋다.
public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
