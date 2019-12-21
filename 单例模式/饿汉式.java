package 单例模式;

public class 饿汉式 {
    private 饿汉式() {
    };

    private static final 饿汉式 instance = new 饿汉式();

    public static 饿汉式 getInstance(){
        return instance;
    }
}
