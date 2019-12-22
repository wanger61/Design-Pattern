package 中介者模式;

public abstract class Mediator {
    abstract void send(String message, Colleague colleague);
}
