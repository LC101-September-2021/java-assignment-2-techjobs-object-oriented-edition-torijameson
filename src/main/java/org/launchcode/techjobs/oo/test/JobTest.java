package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Before;
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
    Job job1;
    Job job2;
    Job job3;

    @Before
    public void createJobObject() {
       Employer employer1 = new Employer ("launchcode");
       Location location1= new Location("StL");
       PositionType positionType1= new PositionType("Back-end developer");
       CoreCompetency coreCompetency1=  new CoreCompetency("Java");
        Employer employer2 = new Employer ("Cisco");
        Location location2= new Location("KC");
        PositionType positionType2= new PositionType("Front-end developer");
        CoreCompetency coreCompetency2=  new CoreCompetency("JavaScript");


       job1 = new Job("Web Developer", employer1, location1, positionType1, coreCompetency1);
       job2 = new Job("Data Scientist", employer2, location2, positionType2, coreCompetency2);
       job3 = new Job("Web Developer", employer1, location1, positionType1, coreCompetency1);
    }

    @Test
    public void testSettingJobId() {

        // assertEquals(expected, actual, optional_delta);

        //  assertFalse(condition);

        //  assertTrue(condition);

        // assertNotNull(object);

        //for test where they are one one id apart
        //assertEquals(1, jobTwo.id - JobOne.id,  0);
        // or like - assertTrue(jobTwo.id-jobOne.id=1);   ?
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        //A
        // new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"))
        //Assertions that these things show up right - class and value. result is boolean "objectName instanceof ClassName"
    }

    @Test
    public void testJobsForEquality (){
        //Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
        Assert.assertFalse(job1.getId()==job3.getId());
        Assert.assertTrue(job1.getName().equals(job3.getName()));
        Assert.assertTrue(job1.getEmployer()== job3.getEmployer());
        Assert.assertTrue(job1.getLocation()==job3.getLocation());
        Assert.assertTrue(job1.getPositionType()==job3.getPositionType());
        Assert.assertTrue(job1.getCoreCompetency()==job3.getCoreCompetency());

    }
@Test
    public void testToStringHandlesEmptyField(){

}
@Test
    public void testToStringStartsAndEndsWithNewLine(){

}
@Test
    public void testToStringContainsCorrectLabelsAndData(){

}

}

