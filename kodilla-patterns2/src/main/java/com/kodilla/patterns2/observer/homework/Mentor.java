package com.kodilla.patterns2.observer.homework;

public class Mentor implements TasksObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(name + ": New tasks in queue " + tasksQueue.getName() + "\n" +
                " (total: " + tasksQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
