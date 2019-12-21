package 建造者模式;

public class Direct {

    private Builder bulider;

    public Direct(Builder builder){
        this.bulider = builder;
    }

    public House construct(){
        bulider.addColor();
        bulider.addHighth();
        return bulider.buileHouse();
    }
}
