package 工厂方法;

public class Test {
    public static void main(String[] args) {
        Factory factory = new AddFactory();
        Operation operation = factory.getOperation();
        operation.setNumberA(10);
        operation.setNumberB(20);
        System.out.println(operation.getResult());
    }
}
