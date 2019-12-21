package 备忘录模式;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setState("活着");
        System.out.println(p.getState());

        Caretaker c = new Caretaker();
        c.setMemento(p.createMemento());

        p.setState("死了");
        System.out.println(p.getState());

        p.setMemento(c.getMemento());
        System.out.println(p.getState());
    }
}
