package com.example.RelationshipsLab;

import com.example.RelationshipsLab.models.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){

        employee = new Employee("Joe", "Bloggs", 34546587);

    }

    @Test
    public void hasFirstName(){
        assertEquals("Joe", employee.getFirstName());
    }

    @Test
    public void canSetFirstName(){
        employee.setFirstName("Jack");
        assertEquals("Jack", employee.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Bloggs", employee.getLastName());
    }

    @Test
    public void canSetLastName() {
        employee.setLastName("Jones");
        assertEquals("Jones", employee.getLastName());
    }

    @Test
    public void hasEmployeeNo(){
        assertEquals(34546587, employee.getEmployeeNo());
    }

    @Test
    public void canSetEmployeeNo(){
        employee.setEmployeeNo(1);
        assertEquals(1, employee.getEmployeeNo());
    }

}
