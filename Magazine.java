package lesson6_9.adapter.observer;


public class Magazine extends Pressa {

    @Override
    public void display() {

        System.out.println("New edition of magazine " + name + " " + date);
    }
}
