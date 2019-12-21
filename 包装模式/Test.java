package 包装模式;

public class Test {
    public static void main(String[] args) {
        Person ps = new Person("小明");
        Tshirt ts = new Tshirt();
        ts.Decorate(ps);
        ts.show();
    }
}
