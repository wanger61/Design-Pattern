package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> children = new ArrayList<>();
    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void eat() {
        System.out.println("吃大餐........");
        for(Component c:children){
            c.eat();
        }
    }
}
