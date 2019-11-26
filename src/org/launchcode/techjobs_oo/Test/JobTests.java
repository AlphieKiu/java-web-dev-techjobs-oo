package org.launchcode.techjobs_oo.Test;


import static org.junit.Assert.*;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

public class JobTests {
  Job test_job = new Job();
  Job test_job2 = new Job();

  @Test
  public void equalId() {
    assertTrue(test_job.equals(test_job));
  }

  @Test
    public void unequalId() {
      assertFalse(test_job.equals(test_job2));
  }

}
