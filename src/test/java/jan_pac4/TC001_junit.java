package jan_pac4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC001_junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is Befor Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is Ater Class");
	}
	

	@Before
	public void setUp() throws Exception {
		System.out.println("This is Befor Class");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is After Class");
	}

	@Test
	public void test1() {
		System.out.println("This is the test1");
	}
	@Test
	public void test2() {
		System.out.println("This is the test2");
	}
	
	
}
