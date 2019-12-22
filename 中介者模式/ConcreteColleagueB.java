package 中介者模式;

public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        this.name = "小白";
    }
}
