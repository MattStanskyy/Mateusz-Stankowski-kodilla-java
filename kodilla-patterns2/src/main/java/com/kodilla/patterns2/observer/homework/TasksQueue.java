package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements TasksQueueObservable {
    private final List<TasksObserver> tasksObservers;
    private final List<String> tasks;
    private final String name;

    public TasksQueue(String name) {
        tasksObservers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerObserver(TasksObserver tasksObserver) {
        tasksObservers.add(tasksObserver);
    }

    @Override
    public void removeObserver(TasksObserver tasksObserver) {
        tasksObservers.remove(tasksObserver);
    }

    @Override
    public void notifyObservers() {
        for (TasksObserver tasksObserver : tasksObservers) {
            tasksObserver.update(this);
        }
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
