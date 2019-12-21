package 模版方法模式;

public class Chinese extends Lunch {
    @Override
    void eatMain() {
        System.out.println("吃米饭");
    }

    @Override
    void drinkSoup() {
        System.out.println("喝番茄鸡蛋汤");
    }

    @Override
    void earDessert() {
        System.out.println("吃水果");
    }
}
