package 命令模式;

public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Commoned commoned = new ConcreteCommoned(receiver);

        invoker.setCommoned(commoned);
        invoker.start();
    }
}
