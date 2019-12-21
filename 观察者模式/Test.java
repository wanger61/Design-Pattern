package 观察者模式;

public class Test {
    public static void main(String[] args) {
        Weather w = new Weather();
        Observer sina = new Sina();
        w.addObserver(sina);
        w.setTemperature(25);
        System.out.println(((Sina) sina).getTemperature());
    }
}
