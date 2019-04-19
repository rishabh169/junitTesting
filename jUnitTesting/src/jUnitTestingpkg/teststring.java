package jUnitTestingpkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teststring {

	@Test
	void test() {
		jUnitFunction j=new jUnitFunction();
		String res= j.addstring("Sai", "Teja");
		assertEquals("SaiTeja",res);
	}

}
