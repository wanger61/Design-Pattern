package 享元模式;

public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight x1 = flyweightFactory.getFlyweight("X");
        Flyweight x2 = flyweightFactory.getFlyweight("X");

        x1.operation();
        System.out.println(x1 == x2); //创建的是相同的实例

    }
}
