package io.codejournal.maven.unittests.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class RunnerTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("\nRunning setUp...");
    }

    public void sumReturnsCorrectResult1() {

        System.out.println("Running sumReturnsCorrectResult1...");

        final int number1 = 3;
        final int number2 = 5;

        final int expected = 8;

        final int actual = Runner.sum(number1, number2);

        assertEquals(actual, expected);
    }

    public void sumReturnsCorrectResult2() {

        System.out.println("Running sumReturnsCorrectResult2...");

        final int number1 = 3;
        final int number2 = 5;

        final int expected = 8;

        final int actual = Runner.sum(number1, number2);

        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Running tearDown...\n");
    }
}
