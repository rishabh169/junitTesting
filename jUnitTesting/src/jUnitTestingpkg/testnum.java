package jUnitTestingpkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testnum {

	@Test
	void test() {
		jUnitFunction j = new jUnitFunction();
		int result = j.addnum(20, 30);
		assertEquals(50,result);
	}

}
