package com.test;

import abstraction.Employee;
import abstraction.Person;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void validateId() {
        Person employee = new Employee(109485, "Shae", "Zotowski", 25);
        employee.office();
        employee.changeName("Lana");
        employee.changeLastname("Blatcnic");
        employee.changeAge(45);
        String actual = employee.toString();
        String expected = "Person{name='Lana , lastname='Blatcnic , age=45}";
        assertEquals(actual, expected);
    }
}
