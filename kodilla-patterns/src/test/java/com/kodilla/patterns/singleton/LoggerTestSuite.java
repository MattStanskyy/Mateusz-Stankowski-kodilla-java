package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void newLogs() {
        logger = Logger.LOG;
        logger.log("Log Testing 1");
        logger.log("Log Testing 2");
        logger.log("Log Testing 3");
        logger.log("Log Testing 4");
    }

    @Test
    void testGetLastLog() {
        //Given


        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals("Log Testing 4",lastLog);
    }
}
