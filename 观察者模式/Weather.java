package 观察者模式;


public class Weather extends Subject {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notified();
    }

    @Override
    void notified() {
        for (Observer o: observers){
            o.update(temperature);
        }
    }
}
