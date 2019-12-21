package 建造者模式;

public class Test {
    public static void main(String[] args) {
        Direct direct = new Direct(new ConcreteBuilderA());
        House construct = direct.construct();
        System.out.println(construct);
    }
}
