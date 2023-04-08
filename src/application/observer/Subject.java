package application.observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observer;

    /**
     * Attach an observer to the subject
     *
     * @param observer Observer
     */
    public void attach(Observer observer) {
        this.observer.add(observer);
    }

    /**
     * Detach an observer from the subject
     *
     * @param observer Observer
     */
    public void detach(Observer observer) {
        this.observer.remove(observer);
    }

    /**
     * Notify all observers
     */
    public void notifyObserver() {
        for (Observer observer : this.observer) {
            observer.update();
        }
    }
}