package 状态模式;

public class Noodles {
    private State state;
    private int hour;

    public Noodles() {
        this.state = new WashingState(this);
        this.hour = 0;
    }

    public void Start(){
        state.handle();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
