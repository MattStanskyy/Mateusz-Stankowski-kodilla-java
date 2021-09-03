package com.kodilla.patterns2.observer.homework;

public interface TasksQueueObservable {
    void registerObserver(TasksObserver tasksObserver);
    void notifyObservers();
    void removeObserver(TasksObserver tasksObserver);
}
