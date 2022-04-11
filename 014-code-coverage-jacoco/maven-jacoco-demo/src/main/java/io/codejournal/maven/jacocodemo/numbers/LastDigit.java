package io.codejournal.maven.jacocodemo.numbers;

public class LastDigit {

    public final boolean lastDigit(final int a, final int b) {

        final int lastDigitA = a % 10;
        final int lastDigitB = b % 10;

        return (lastDigitA == lastDigitB);
    }
}

class Random {

    public void testing(){
    }
}