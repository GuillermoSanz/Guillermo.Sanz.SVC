package Package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class C11Test {
	@Test
	public void m1Test() {
		C11 tester = new C11();
		assertEquals("m1", tester.m1());
	}
	@Test
	public void m2Test() {
		C11 tester = new C11();
		assertEquals("m2", tester.m2());
	}
}
