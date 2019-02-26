package com.example.RelationshipsLab;

import com.example.RelationshipsLab.models.Project;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjectTest {

    Project project;

    @Before
    public void before(){

        project = new Project("Lab", 1);

    }

    @Test
    public void hasName(){
        assertEquals("Lab", project.getName());
    }

    @Test
    public void canSetName(){
        project.setName("Lab2");
        assertEquals("Lab2", project.getName());
    }

    @Test
    public void hasNoDays(){
        assertEquals(1, project.getNoDays());
    }

    @Test
    public void canSetNoDays(){
        project.setNoDays(2);
        assertEquals(2, project.getNoDays());
    }

}
