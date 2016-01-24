package lesson6_9.adapter.observer;


import java.util.Date;

public abstract class Pressa {

    protected String name = null;
    protected Date date = null;

    public abstract void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
