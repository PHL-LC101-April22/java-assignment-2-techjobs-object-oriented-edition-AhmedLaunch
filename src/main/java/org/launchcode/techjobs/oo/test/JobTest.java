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

        assertEquals(testJob1, testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(toString(testJob1.getName()),("\n"));

    }



}
