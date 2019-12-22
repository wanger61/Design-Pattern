package 享元模式;

import java.util.HashMap;

public class FlyweightFactory {
    HashMap<String,Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory(){
        flyweights.put("X",new Flyweight());
        flyweights.put("Y",new Flyweight());
        flyweights.put("Z",new Flyweight());
    }

    public Flyweight getFlyweight(String s){
        return flyweights.get(s);
    }
}
