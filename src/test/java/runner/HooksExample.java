package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExample {

	   @Before
	    public void setUp() {
	        System.out.println("Setup before scenario");
	    }

	    @After
	    public void tearDown() {
	        System.out.println("Cleanup after scenario");
	    }

}
