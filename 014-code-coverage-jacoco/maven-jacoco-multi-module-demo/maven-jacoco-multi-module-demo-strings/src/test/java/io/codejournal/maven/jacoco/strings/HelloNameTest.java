package io.codejournal.maven.jacoco.strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloNameTest {

    private HelloName fixture;

    @BeforeEach
    public void setUp() {
        fixture = new HelloName();
    }

    @Test
    public void shouldReturnHelloWhenNameIsNull() {

        final String name = null;

        final String expected = "Hello!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnHelloWhenNameIsEmpty() {

        final String name = "";

        final String expected = "Hello!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnGreetingWhenNameIsNotEmpty1() {

        final String name = "Bob";

        final String expected = "Hello Bob!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnGreetingWhenNameIsNotEmpty2() {

        final String name = "X";

        final String expected = "Hello X!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnGreetingWhenNameIsNotEmpty3() {

        final String name = "Alice";

        final String expected = "Hello Alice!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }
}
