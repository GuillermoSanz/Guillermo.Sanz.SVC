package Package1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C31Test {
	@Test
	public void m1Test() {
		C21 tester = new C21();
		assertEquals("m1", tester.m1());
	}
	@Test
	public void m2Test() {
		C21 tester = new C21();
		assertEquals("m2", tester.m2());
	}
}
