package 策略模式;

public class StrategyCut implements Strategy {
    private double money;
    private double cut;

    public StrategyCut(double cut) {
        this.cut = cut;
    }

    @Override
    public double getMoney(double money) {
        return money * cut;
    }
}
