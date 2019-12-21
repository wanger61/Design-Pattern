package 状态模式;

public class CookingState extends State {

    Noodles noodles;

    public CookingState(Noodles noodles) {
        this.noodles = noodles;
    }


    @Override
    void handle() {
        System.out.println("正在煮面条.......");
        noodles.setHour(noodles.getHour()+2);
        noodles.setState(new EatingState(noodles));
    }
}
