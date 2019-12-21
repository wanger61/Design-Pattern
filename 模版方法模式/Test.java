package 模版方法模式;

public class Test {
    public static void main(String[] args) {
        Lunch c = new Chinese();
        Lunch a = new America();

        c.eating();
        a.eating();
    }
}
