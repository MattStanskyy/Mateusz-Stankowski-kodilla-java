package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("Ending to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests of ShapeCollector functions")
    class FunctionsTests {
        @Test
        public void testAddFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(2.4);
            Shape shape2 = new Circle(6.5);
            //When
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            //Then
            assertEquals(2, shapeCollector.showFigures().size());
        }

        @Test
        public void testRemoveFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(2.4);
            Shape shape2 = new Circle(6.5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            //When
            boolean result1 = shapeCollector.removeFigure(shape1);
            boolean result2 = shapeCollector.removeFigure(shape2);
            //Then
            assertTrue(result1);
            assertTrue(result2);
            assertEquals(0, shapeCollector.showFigures().size());
        }

        @Test
        public void testGetFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(2.4);
            Shape shape2 = new Circle(6.5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            //When
            Shape shapeResult1 = shapeCollector.getFigure(0);
            Shape shapeResult2 = shapeCollector.getFigure(1);
            //Then
            assertEquals(shape1, shapeResult1);
            assertEquals(shape2, shapeResult2);
        }

        @Test
        public void testShowFigures() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(2.4);
            Shape shape2 = new Circle(6.5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape1);
            shapeList.add(shape2);
            //When
            List<Shape> shapeResultList = shapeCollector.showFigures();
            //Then
            assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }
}
