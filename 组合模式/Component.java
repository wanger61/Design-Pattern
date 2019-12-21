package 组合模式;

public abstract class Component {

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void eat();
}
