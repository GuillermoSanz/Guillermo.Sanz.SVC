package Package1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C32Test {
	@Test
	public void m1Test() {
		C32 tester = new C32();
		assertEquals("mA", tester.mA());
	}
}
