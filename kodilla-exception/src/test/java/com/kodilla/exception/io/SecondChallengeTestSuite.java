package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testSecondChallenge() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.9, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1.6))
        );
    }
}
