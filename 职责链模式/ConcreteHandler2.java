package 职责链模式;

public class ConcreteHandler2 extends Handler {

    @Override
    public void Handle(int request) {
        System.out.println("被2号处理了");
    }
}
