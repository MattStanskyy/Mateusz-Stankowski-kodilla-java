package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("End the module at Kodilla.com");
        board.getInProgressList().addTask("Do the latest assignment");
        board.getDoneList().addTask("Watch a movie");
        boolean toDoList = board.getToDoList().getTasks().contains("End the module at Kodilla.com");
        boolean inProgressList = board.getInProgressList().getTasks().contains("Do the latest assignment");
        boolean doneList = board.getDoneList().getTasks().contains("Watch a movie");

        //Then
        assertEquals(true, toDoList);
        assertEquals(true, inProgressList);
        assertEquals(true, doneList);
    }
}
