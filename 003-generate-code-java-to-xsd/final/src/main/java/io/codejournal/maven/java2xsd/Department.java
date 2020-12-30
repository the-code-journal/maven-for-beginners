package io.codejournal.maven.java2xsd;

import static java.lang.String.format;

public class Department {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(final int value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(final String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        return format("Department[id=%s, name=%s]", id, name);
    }
}
