package 中介者模式;

public class Colleague {
    private Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String meaasge){
        mediator.send(meaasge,this);
    }

    public void notified(){
        System.out.println(name + "被通知了");
    }
}
