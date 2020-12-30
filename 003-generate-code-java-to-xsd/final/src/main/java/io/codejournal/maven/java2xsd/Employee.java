package io.codejournal.maven.java2xsd;

import static java.lang.String.format;

public class Employee {

    private int id;

    private String name;

    private Department dept;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department value) {
        this.dept = value;
    }

    @Override
    public String toString() {
        return format("Employee[id=%s, name=%s, dept=%s]", id, name, dept);
    }
}
