package 状态模式;

public class EatingState extends State {
    Noodles noodles;
    public EatingState(Noodles noodles) {
        this.noodles = noodles;
    }

    @Override
    void handle() {
        System.out.println("正在吃面条.......");
        noodles.setHour(noodles.getHour()+2);
    }
}
