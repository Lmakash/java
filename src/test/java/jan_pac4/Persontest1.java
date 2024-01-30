package jan_pac4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Persontest1 {

	@Test
	public void Test() {
		Person p=new Person("Akash","Shendage");
		//System.out.println(p.getfname());
//		System.out.println(p.getlname());
		System.out.println(p.getFullName());
		assertEquals("Akash Shendag",p.getFullName());
	}
	
}
