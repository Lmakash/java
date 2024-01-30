package jan_pac4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateTC002 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Date d=new Date(12,02,2022);
//		System.out.println(d.getDay());
//		System.out.println(d.getMonth());
//		System.out.println(d.getYear());
		System.out.println(d.toString());
		assertEquals("Date [Day=12, Month=2, Year=2022]",d.toString());
	}

}
