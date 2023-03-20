package application.mvc.view;

import application.observer.Observer;
import application.observer.Subject;

public abstract class View implements Observer {
    public abstract void update(Subject subject);
    public abstract void display();
}
