package 代理模式;

public class Proxy implements Subject {
    RealSubject realSubject;
    @Override
    public void Request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
