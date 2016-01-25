package lesson6_9.adapter.observer;


public class Subscriber implements Observer{

    private Pressa pressa;
    private Subject publisher;

    public Subscriber(Subject publisher, Pressa pressa) {

        this.publisher = publisher;
        subscribeOnPressa(pressa);
        publisher.registerObserver(this);
    }

    @Override
    public void update(Pressa pressa) {
        this.pressa = pressa;
        System.out.println("New edition of " + pressa.getName() + " " + pressa.getDate());
    }

    public void subscribeOnPressa(Pressa pressa) {
        this.pressa = pressa;
    }

    public Pressa getPressa() {
        return pressa;
    }
}
