package 状态模式;

public class WashingState extends State {

    Noodles noodles;

    public WashingState(Noodles noodles) {
        this.noodles = noodles;
    }

    @Override
    void handle() {
        System.out.println("正在洗面条.......");
        noodles.setHour(noodles.getHour()+2);
        noodles.setState(new CookingState(noodles));
    }
}
