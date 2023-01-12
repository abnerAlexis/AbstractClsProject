package com.test;

import abstraction.Employee;
import abstraction.Person;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void validateId() {
        Person employee = new Employee(109485, "Shae", "Zotowski", 25);

        String actualEmployeeLog = employee.office();
        String expectedEmployeeLog = "Employee logged in.";
        assertEquals(actualEmployeeLog, expectedEmployeeLog);

        employee.changeName("Lana");
        employee.changeLastname("Blatchnic");
        employee.changeAge(45);
        String actual = employee.toString();
        String expected = "Person{name='Lana , lastname='Blatchnic , age=45}";
        assertEquals(actual, expected);
    }
}
