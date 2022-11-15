package Observer_Notify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String title, Date date, String place, String univName) {
        for (Observer o : observers) {
            o.receive(title,date,place, univName);
        }
    }
}
