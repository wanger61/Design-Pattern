package 模版方法模式;

public class America extends Lunch{
    @Override
    void eatMain() {
        System.out.println("吃汉堡🍔");
    }

    @Override
    void drinkSoup() {
        System.out.println("喝蘑菇汤");
    }

    @Override
    void earDessert() {
        System.out.println("吃冰淇淋");
    }
}
