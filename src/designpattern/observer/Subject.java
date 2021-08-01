package designpattern.observer;

import java.util.ArrayList;

public abstract class Subject {
    public ArrayList<Observer> observers = new ArrayList<>();

    abstract void notifyObserver();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }
}
