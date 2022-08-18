package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJobAllFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJobAllFields instanceof Job);
        assertEquals(testJobAllFields.getName(), "Product tester");

        assertTrue(testJobAllFields.getEmployer() instanceof Employer);
        assertEquals(testJobAllFields.getEmployer().getValue(), "ACME");

        assertTrue(testJobAllFields.getLocation() instanceof Location);
        assertEquals(testJobAllFields.getLocation().getValue(), "Desert");

        assertTrue(testJobAllFields.getPositionType() instanceof PositionType);
        assertEquals(testJobAllFields.getPositionType().getValue(), "Quality control");

        assertTrue(testJobAllFields.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJobAllFields.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals('\n', testJob1.toString().charAt(0));
        assertEquals('\n', testJob1.toString().charAt(testJob1.toString().length() -1));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue( testJob1.toString().contains("\nName: Product tester"));
        assertTrue( testJob1.toString().contains("\nEmployer: ACME"));
        assertTrue( testJob1.toString().contains("\nLocation: Desert"));
        assertTrue( testJob1.toString().contains("\nPosition Type: Quality control"));
        assertTrue( testJob1.toString().contains("\nCore Competency: Persistence"));
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob1 = new Job("", new Employer(null), new Location(null), new PositionType(null), new CoreCompetency(null));
        assertTrue( testJob1.toString().contains("\nName: Data not available"));
        assertTrue( testJob1.toString().contains("\nEmployer: Data not available"));
        assertTrue( testJob1.toString().contains("\nLocation: Data not available"));
        assertTrue( testJob1.toString().contains("\nPosition Type: Data not available"));
        assertTrue( testJob1.toString().contains("\nCore Competency: Data not available"));
    }



}
