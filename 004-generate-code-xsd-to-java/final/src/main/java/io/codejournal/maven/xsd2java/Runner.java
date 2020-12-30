package io.codejournal.maven.xsd2java;

public class Runner {

    public static void main(final String[] args) {

        final ObjectFactory factory = new ObjectFactory();

        final Department dept = factory.createDepartment();
        dept.setId(1);
        dept.setName("Finance");

        final Employee emp = factory.createEmployee();
        emp.setId(1001);
        emp.setName("John Doe");
        emp.setDept(dept);

        System.out.println(emp);
    }
}
