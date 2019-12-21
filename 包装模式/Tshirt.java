package 包装模式;

public class Tshirt extends DecoratePerson {

    @Override
    public void show(){
        super.show();
        System.out.println("T-shirts");
    }
}
