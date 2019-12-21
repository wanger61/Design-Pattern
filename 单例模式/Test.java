package 单例模式;

public class Test {
    public static void main(String[] args) {
        饿汉式 a = 饿汉式.getInstance();
        饿汉式 b = 饿汉式.getInstance();
        System.out.println(a == b);

        懒汉式 c = 懒汉式.getInstance();
        懒汉式 d = 懒汉式.getInstance();
        System.out.println(c == d);
    }


}
