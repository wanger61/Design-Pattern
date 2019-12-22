package 中介者模式;

public class ConcreteMediator extends Mediator {
    ConcreteColleague c1 ;
    ConcreteColleagueB c2;

    public void setC1(ConcreteColleague c1) {
        this.c1 = c1;
    }

    public void setC2(ConcreteColleagueB c2) {
        this.c2 = c2;
    }

    @Override
    void send(String message, Colleague colleague) {
        if (colleague == c1){
            c2.notified();
        }else {
            c1.notified();
        }
    }
}
