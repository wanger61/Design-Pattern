package 建造者模式;

public abstract class Builder {
    protected House house = new House();

    abstract void addColor();
    abstract void addHighth();

    public House buileHouse(){
        return house;
    }

}
