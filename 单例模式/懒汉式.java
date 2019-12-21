package 单例模式;

public class 懒汉式 {
    private 懒汉式(){

    };

    private static volatile 懒汉式 instance;

    public static 懒汉式 getInstance(){
        if (instance == null){
            synchronized (懒汉式.class){
                if (instance == null){
                    instance = new 懒汉式();
                }
            }
        }
        return instance;
    }
}
