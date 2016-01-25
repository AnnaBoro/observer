package lesson6_9.adapter.observer;


import java.util.ArrayList;

public class Publisher implements Subject{

    private ArrayList<Observer> observersForMagazine;
    private ArrayList<Observer> observersForNewspaper;
    private Pressa pressa;

    public Publisher() {

        observersForMagazine = new ArrayList<Observer>();
        observersForNewspaper = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {

        if (o instanceof Subscriber) {
            if (((Subscriber) o).getPressa() instanceof Magazine) {
                observersForMagazine.add(o);
            }
            else if (((Subscriber) o).getPressa() instanceof Newspaper){
                observersForNewspaper.add(o);
            }
        }
    }

    @Override
    public void removeObserver(Observer o) {

        if (o instanceof Subscriber) {
            if (((Subscriber) o).getPressa() instanceof Magazine) {
                int i = observersForMagazine.indexOf(o);
                if (i >= 0) {
                    observersForMagazine.remove(i);
                }
            } else if (((Subscriber) o).getPressa() instanceof Newspaper) {
                int i = observersForNewspaper.indexOf(o);
                if (i >= 0) {
                    observersForNewspaper.remove(i);
                }
            }
        }
    }

    @Override
    public void notifyObservers() {

        if (getPressa() instanceof Magazine)
            for (Observer o : observersForMagazine) {
                o.update(pressa);
        }
        else if (getPressa() instanceof Newspaper) {
            for (Observer o : observersForNewspaper) {
                o.update(pressa);
            }
        }
    }

    public void setPressa(Pressa pressa) {

        this.pressa = pressa;
    }

    public Pressa getPressa() {
        return pressa;
    }

    public ArrayList<Observer> getObserversForMagazine() {
        return observersForMagazine;
    }

    public ArrayList<Observer> getObserversForNewspaper() {
        return observersForNewspaper;
    }
}
