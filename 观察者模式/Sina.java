package 观察者模式;

public class Sina extends Observer {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
    }
}
