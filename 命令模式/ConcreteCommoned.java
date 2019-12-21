package 命令模式;

public class ConcreteCommoned extends Commoned {
    public ConcreteCommoned(Receiver receiver) {
        super(receiver);
    }

    @Override
    void handle() {
        receiver.bakeChilken();
    }
}
