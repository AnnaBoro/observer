package lesson6_9.adapter.observer;

public class Newspaper extends Pressa{

    @Override
    public void display() {
        System.out.println("New edition of newspaper " + this.name + " " + this.date);
    }
}
