package io.codejournal.maven.unittests.junit4andjunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunnerJUnit5Test {

    @BeforeEach
    public void setUp() {
        System.out.println("\nRunning setUp...");
    }

    @Test
    public void sumReturnsCorrectResult() {

        System.out.println("Running sumReturnsCorrectResult...");

        final int number1 = 3;
        final int number2 = 5;

        final int expected = 8;

        final int actual = Runner.sum(number1, number2);

        assertEquals(expected, actual);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Running tearDown...\n");
    }
}
