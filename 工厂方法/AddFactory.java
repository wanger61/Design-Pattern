package 工厂方法;

public class AddFactory implements Factory {
    @Override
    public Operation getOperation() {
        return new OperationAdd();
    }
}
