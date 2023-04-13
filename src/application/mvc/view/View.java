package application.mvc.view;

import application.observer.Observer;
import application.observer.Subject;

public abstract class View implements Observer {
    /**
     * Update the view
     *
     * @param subject Subject
     */
    public abstract void update(Subject subject);
    /**
     * Display the view
     */
    public abstract void display();
}
