package lesson6_9.adapter.observer;


import java.util.Date;

public class ObserverDemo {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        Pressa pressa1 = new Magazine();
        pressa1.setName("Cosmo");
        pressa1.setDate(new Date());

        Subscriber subscriber1 = new Subscriber(publisher, pressa1);
        publisher.setPressa(pressa1);
        publisher.notifyObservers();

        Pressa pressa2 = new Newspaper();
        pressa2.setName("Pravda");
        pressa2.setDate(new Date());

        Subscriber subscriber2 = new Subscriber(publisher, pressa2);
        Subscriber subscriber3 = new Subscriber(publisher, pressa2);
        publisher.setPressa(pressa2);
        publisher.notifyObservers();
    }
}
