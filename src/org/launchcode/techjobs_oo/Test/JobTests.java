package org.launchcode.techjobs_oo.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTests {

   private static Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   private static Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
   private static Job test_job_empty= new Job();
   private static Job test_job_emptyField = new Job ("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"),new CoreCompetency("Persistence"));

  @Test
    public void TestUnequalIdIdenticalFields() {
      assertFalse(test_job.equals(test_job2));
  }

  @Test
  public void testJobConstructorSetsAllFields() {
    assertTrue (test_job2 instanceof Job);
  }

  @Test
  public void testToStringStartsWithBlankLine() {
    assertTrue(test_job.toString().startsWith("\n"));
  }

  @Test
  public void testToStringEndsWithBlankLine() {
    assertTrue(test_job.toString().endsWith("\n"));
  }

  @Test
  public void testToStringHasLabelsAndData() {
    assertEquals("\nID: 1\n" +
            "Name: Product tester\n" +
            "Employer: ACME\n" +
            "Location: Desert\n" +
            "Position Type: Quality control\n" +
            "Core Competency: Persistence\n",test_job.toString());
  }

  @Test
  public void testToStringJobDoesNotExist() {
    assertEquals("OOPS! This job does not seem to exist." , test_job_empty.toString());
  }

  @Test
  public void testToStringJobWithEmptyFields () {
    assertEquals( "\nID: 4\n" +
            "Name: Product tester\n" +
            "Employer: Data not available\n" +
            "Location: Data not available\n" +
            "Position Type: Quality control\n" +
            "Core Competency: Persistence\n", test_job_emptyField.toString());
  }

}
