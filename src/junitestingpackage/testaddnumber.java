package junitestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumbers {

	@Test
	void test() {
		junitfunction junit = new junitfunction();
		int result = junit.addNumbers(10, 20);
		assertEquals(30,result);
	}

}
