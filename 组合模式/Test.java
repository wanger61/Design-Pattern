package 组合模式;

public class Test {
    public static void main(String[] args) {
        Component root = new Composite();
        root.add(new Leaf());
        root.add(new Leaf());

        Component comp = new Composite();
        root.add(comp);
        comp.add(new Leaf());

        root.eat();
    }
}
