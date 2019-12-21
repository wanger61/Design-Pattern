package 策略模式;

import org.junit.Test;

public class Context {
    Strategy strategy;

    public Context(String s) {
        switch (s){
            case "打5折":
                strategy = new StrategyCut(0.5);
                break;
            case  "无活动":
                strategy = new StrategyNormal();
                break;
        }
    }

    public double contextInterface(double money){
        return strategy.getMoney(money);
    }

    @Test
    public void test(){
        Context context = new Context("打5折");
        System.out.println(context.contextInterface(100));
    }
}
