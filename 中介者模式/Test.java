package 中介者模式;

public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague a = new ConcreteColleague(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);

        mediator.setC1(a);
        mediator.setC2(b);

        a.sendMessage("AA");
    }
}
