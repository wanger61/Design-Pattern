package 组合模式;

public class Leaf extends Component {
    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public void eat() {
        System.out.println("吃盒饭........");
    }
}
