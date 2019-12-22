package 职责链模式;

public class Test {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);
        h1.Handle(1);
        h1.Handle(15);
    }
}
