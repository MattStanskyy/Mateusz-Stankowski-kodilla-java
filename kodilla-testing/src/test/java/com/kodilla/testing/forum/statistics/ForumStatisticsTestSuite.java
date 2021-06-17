package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

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

    private static List<String> usersGenerator (int usersQuantity) {
        List<String> usersList = new ArrayList<>();
        for (int n = 0; n < usersQuantity; n++) {
            usersList.add("User" + n);
        }
        return usersList;
    }

    @Nested
    @DisplayName("Tests of post statistics functions")
    class PostsTests {

        @Test
        public void testsWhenPostsQuantityEquals0() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(250));
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(250);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(250, forumStatistics.getUsersQuantity());
            assertEquals(0, forumStatistics.getPostsQuantity());
            assertEquals(250, forumStatistics.getCommentsQuantity());
            assertEquals(0, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(1, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }

        @Test
        public void testsWhenPostsQuantityEquals1000() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(250));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(250, forumStatistics.getUsersQuantity());
            assertEquals(1000, forumStatistics.getPostsQuantity());
            assertEquals(0, forumStatistics.getCommentsQuantity());
            assertEquals(4, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }
    }

    @Nested
    @DisplayName("Tests of statistics comments functions")
    class CommentsTests {

        @Test
        public void testsWhenCommentsQuantityEquals0() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(250));
            when(statisticsMock.postsCount()).thenReturn(250);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(250, forumStatistics.getUsersQuantity());
            assertEquals(250, forumStatistics.getPostsQuantity());
            assertEquals(0, forumStatistics.getCommentsQuantity());
            assertEquals(1, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }

        @Test
        public void testsWhenCommentsQuantityLessThanPostsQuantity() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(250));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(500);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(250, forumStatistics.getUsersQuantity());
            assertEquals(1000, forumStatistics.getPostsQuantity());
            assertEquals(500, forumStatistics.getCommentsQuantity());
            assertEquals(4, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(2, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }

        @Test
        public void testsWhenCommentsQuantityGreaterThanPostsQuantity() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(250));
            when(statisticsMock.postsCount()).thenReturn(500);
            when(statisticsMock.commentsCount()).thenReturn(1000);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(250, forumStatistics.getUsersQuantity());
            assertEquals(500, forumStatistics.getPostsQuantity());
            assertEquals(1000, forumStatistics.getCommentsQuantity());
            assertEquals(2, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(4, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(2, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }
    }

    @Nested
    @DisplayName("Tests of users statistics functions")
    class UsersTests {

        @Test
        public void testsWhenUsersQuantityEquals0() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(0));
            when(statisticsMock.postsCount()).thenReturn(500);
            when(statisticsMock.commentsCount()).thenReturn(1000);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(0, forumStatistics.getUsersQuantity());
            assertEquals(500, forumStatistics.getPostsQuantity());
            assertEquals(1000, forumStatistics.getCommentsQuantity());
            assertEquals(0, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(2, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }

        @Test
        public void testsWhenUsersQuantityEquals100() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(usersGenerator(100));
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(100);

            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals(100, forumStatistics.getUsersQuantity());
            assertEquals(0, forumStatistics.getPostsQuantity());
            assertEquals(100, forumStatistics.getCommentsQuantity());
            assertEquals(0, forumStatistics.getPostAveragePerUser(), 0.1);
            assertEquals(1, forumStatistics.getCommentsAveragePerUser(), 0.1);
            assertEquals(0, forumStatistics.getCommentsAveragePerPost(), 0.1);
            forumStatistics.showStatistics();

        }
    }
}
