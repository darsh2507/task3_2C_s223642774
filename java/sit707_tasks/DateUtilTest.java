package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S223642774";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Darsh Patel";
		Assert.assertNotNull("Student name is null", studentName);
	}

	
	 @Test
	    public void testIncrement_Day_D1() {
	        DateUtil date = new DateUtil(28, 1, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next day should be 29", 29, date.getDay());
	    }

	
	 @Test
	    public void testIncrement_Day_D2() {
	        DateUtil date = new DateUtil(29, 1, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next day should be 30", 30, date.getDay());
	    }

	
	 @Test
	    public void testIncrement_Day_D3() {
	        DateUtil date = new DateUtil(30, 1, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next day should be 31", 31, date.getDay());
	    }
	

	    @Test
	    public void testIncrement_Day_D4() {
	        DateUtil date = new DateUtil(31, 1, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next day should be 1", 1, date.getDay());
	    }

	    @Test
	    public void testIncrement_Month_M1() {
	        DateUtil date = new DateUtil(30, 4, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next month should be May", 5, date.getMonth());
	    }
	
	
	    @Test
	    public void testIncrement_Month_M2() {
	        DateUtil date = new DateUtil(31, 1, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next month should be February", 2, date.getMonth());
	    }

	    @Test
	    public void testIncrement_Month_M3() {
	        DateUtil date = new DateUtil(28, 2, 2023);
	        date.increment();
	        Assert.assertEquals("Expected next month should be March", 3, date.getMonth());
	    }

	    @Test
	    public void testIncrement_Month_M4() {
	        DateUtil date = new DateUtil(28, 2, 2024);
	        date.increment();
	        Assert.assertEquals("Expected next month should be February", 2, date.getMonth());
	    }
	
   
	    
	
	    @Test
	    public void testIncrement_Year_Y1() {
	        DateUtil date = new DateUtil(28, 2, 2020);
	        date.increment();
	        Assert.assertEquals("Expected next year should be 2020", 2020, date.getYear());
	    } 
	
	
}
