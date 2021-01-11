package io.codejournal.maven.jsonschema2json;

public class Runner {

    public static void main(String[] args) {

        final Employee emp = new Employee();
        emp.setId(1001);
        emp.setName("John Doe");

        final Department dept = new Department();
        dept.setId(1);
        dept.setName("Finance");

        System.out.println(emp);
        System.out.println(dept);
    }
}
