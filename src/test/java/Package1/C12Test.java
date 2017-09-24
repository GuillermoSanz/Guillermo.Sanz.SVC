package Package1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C12Test {
	@Test
	public void m1Test() {
		C12 tester = new C12();
		assertEquals("mA", tester.mA());
	}
}
