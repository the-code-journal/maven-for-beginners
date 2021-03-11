package io.codejournal.maven.unittests.pojo;

public class RunnerTest {

    public void setUp() {
        System.out.println("\nRunning setUp...");
    }

    public void testSum1() {

        System.out.println("Running testSum1...");

        final int number1 = 3;
        final int number2 = 5;

        final int expected = 8;

        final int actual = Runner.sum(number1, number2);

        assert actual == expected;
    }

    public void testSum2() {

        System.out.println("Running testSum2...");

        final int number1 = 1;
        final int number2 = 2;

        final int expected = 3;

        final int actual = Runner.sum(number1, number2);

        assert actual == expected;
    }

    public void tearDown() {
        System.out.println("Running tearDown...\n");
    }
}
