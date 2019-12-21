package 建造者模式;

public class House {
    private String color;
    private String highth;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHighth() {
        return highth;
    }

    public void setHighth(String highth) {
        this.highth = highth;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", highth='" + highth + '\'' +
                '}';
    }
}
