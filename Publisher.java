package lesson6_9.adapter.observer;


import java.util.ArrayList;

public class Publisher implements Subject{

    private ArrayList<Observer> observers;
    private Pressa pressa;

    public Publisher() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {

        for (Observer o : observers) {
            o.update(pressa);
        }
    }

    public void setPressa(Pressa pressa) {
        this.pressa = pressa;
    }
}
