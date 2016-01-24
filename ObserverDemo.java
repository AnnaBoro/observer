package lesson6_9.adapter.observer;


import java.util.Date;

public class ObserverDemo {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber(publisher);
        Subscriber subscriber2 = new Subscriber(publisher);
        Subscriber subscriber3 = new Subscriber(publisher);

        Pressa pressa1 = new Magazine();
        pressa1.setName("Cosmo");
        pressa1.setDate(new Date());

        publisher.setPressa(pressa1);
        subscriber1.subscribeOnPressa(pressa1);
        publisher.notifyObservers();

        Pressa pressa2 = new Newspaper();
        pressa2.setName("Pravda");
        pressa2.setDate(new Date());

        publisher.setPressa(pressa2);

        subscriber2.subscribeOnPressa(pressa2);
        subscriber3.subscribeOnPressa(pressa2);

        publisher.notifyObservers();
    }
}
