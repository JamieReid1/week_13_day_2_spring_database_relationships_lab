package com.example.RelationshipsLab;

import com.example.RelationshipsLab.models.Department;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepartmentTest {

    Department department;

    @Before
    public void before(){

        department = new Department("CodeClan");

    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", department.getName());
    }

    @Test
    public void canSetName(){
        department.setName("CodeBase");
        assertEquals("CodeBase", department.getName());
    }

}
