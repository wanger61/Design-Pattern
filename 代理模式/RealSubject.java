package 代理模式;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("真实对象的Requset");
    }
}
