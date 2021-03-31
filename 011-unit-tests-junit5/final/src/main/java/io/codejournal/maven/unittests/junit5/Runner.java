package io.codejournal.maven.unittests.junit5;

import static java.lang.String.format;

public class Runner {

    public static int sum(final int number1, final int number2) {
        return number1 + number2;
    }

    public static void main(final String[] args) {
        System.out.println(format("sum(%d, %d) => %d", 5, 10, sum(5, 10)));
    }
}
