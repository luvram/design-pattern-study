package study.designpattern.decorator;

public class StreamMilk extends CondimentDecorator {
    Beverage beverage;

    public StreamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀밀크";
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }
}
