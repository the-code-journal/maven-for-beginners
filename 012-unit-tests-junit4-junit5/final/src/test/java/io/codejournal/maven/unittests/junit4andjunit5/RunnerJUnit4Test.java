package io.codejournal.maven.unittests.junit4andjunit5;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunnerJUnit4Test {

    @Before
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

    @After
    public void tearDown() {
        System.out.println("Running tearDown...\n");
    }
}
