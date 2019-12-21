package 外观模式;

public class Facade {
    鸡腿饭 Chi;
    牛腩饭 Beef;
    冰红茶 Tea;

    public Facade(){
        Chi = new 鸡腿饭();
        Beef = new 牛腩饭();
        Tea = new 冰红茶();
    }

    public void 鸡腿饭套餐(){
        Chi.prepare();
        Tea.prepare();
    }

    public void 牛腩饭套餐(){
        Beef.prepare();
        Tea.prepare();
    }
}
