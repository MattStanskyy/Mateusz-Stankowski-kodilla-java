package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        // Given
        TasksQueue student1TasksQueue = new TasksQueue("student1");
        TasksQueue student2TasksQueue = new TasksQueue("student2");
        TasksQueue student3TasksQueue = new TasksQueue("student3");
        TasksQueue student4TasksQueue = new TasksQueue("student4");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1TasksQueue.registerObserver(mentor1);
        student2TasksQueue.registerObserver(mentor2);
        student3TasksQueue.registerObserver(mentor2);
        student4TasksQueue.registerObserver(mentor1);
        // When
        student1TasksQueue.addTask("task1");
        student1TasksQueue.addTask("task2");
        student1TasksQueue.addTask("task3");
        student2TasksQueue.addTask("task1");
        student2TasksQueue.addTask("task2");
        student2TasksQueue.addTask("task3");
        student2TasksQueue.addTask("task4");
        student3TasksQueue.addTask("task1");
        student3TasksQueue.addTask("task2");
        student4TasksQueue.addTask("task1");
        student4TasksQueue.addTask("task2");
        student4TasksQueue.addTask("task3");
        student4TasksQueue.addTask("task4");
        student4TasksQueue.addTask("task5");
        // Then
        assertEquals(8, mentor1.getUpdateCount());
        assertEquals(6, mentor2.getUpdateCount());
    }
}
