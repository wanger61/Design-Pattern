package 建造者模式;

public class ConcreteBuilderA extends Builder {

    @Override
    void addColor() {
        house.setColor("Red");
    }

    @Override
    void addHighth() {
        house.setHighth("15层");
    }
}
