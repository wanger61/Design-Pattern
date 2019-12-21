package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        if (observers.contains(o)){
            observers.remove(o);
        }
    }

    abstract void notified();
}
