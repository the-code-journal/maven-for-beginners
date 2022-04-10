package io.codejournal.maven.jacoco.numbers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LastDigitTest {

    private LastDigit fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LastDigit();
    }

    @Test
    public void shouldReturnTrueWhenLastDigitsAreSame() {

        final int num1 = 17;
        final int num2 = 7;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenLastDigitsAreNotSame() {

        final int num1 = 17;
        final int num2 = 13;

        final boolean expected = false;

        final boolean actual = fixture.lastDigit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
