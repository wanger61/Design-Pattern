package 命令模式;

public abstract class Commoned {
    protected Receiver receiver;

    public Commoned(Receiver receiver){
        this.receiver = receiver;
    }

    abstract void handle();
}
