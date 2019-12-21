package 适配器模式;

public class Test {
    public static void main(String[] args) {
        Target s = new Adapter();
        s.Request();
    }
}
