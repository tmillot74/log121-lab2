package application.observer;

public class Subject {
    private Observer observer;

    public void attach(Observer observer) {
        this.observer = observer;
    }

    public void detach(Observer observer) {
        this.observer = null;
    }

    public void notify(Subject subject) {
        observer.update(subject);
    }
}
