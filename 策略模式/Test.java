package 策略模式;

public class Test {
    public static void main(String[] args) {
        Context context = new Context("无活动");
        System.out.println(context.contextInterface(100));

        Context context2 = new Context("打5折");
        System.out.println(context2.contextInterface(200));
    }
}
