package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "Tomatoes",2);
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "Blue", "House");
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "Warsaw", "Car");
            default:
                return null;
        }
    }
}
