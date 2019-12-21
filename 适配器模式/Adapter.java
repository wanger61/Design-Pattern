package 适配器模式;

public class Adapter extends Target {
    Adaptee adaptee = new Adaptee();

    @Override
    public void Request(){
        adaptee.Arequest();
    }

}
