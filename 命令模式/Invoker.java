package 命令模式;

public class Invoker {
    Commoned commoned;

    public void setCommoned(Commoned commoned) {
        this.commoned = commoned;
    }

    public void start(){
        commoned.handle();
    }
}
