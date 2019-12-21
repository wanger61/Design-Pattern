package 模版方法模式;

public abstract class Lunch {
    abstract void eatMain();
    abstract void drinkSoup();
    abstract void earDessert();

    public void eating(){
        eatMain();
        drinkSoup();
        earDessert();
    }
}
