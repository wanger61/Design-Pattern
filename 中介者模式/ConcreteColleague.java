package 中介者模式;

public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
        this.name = "小明";
    }

}
