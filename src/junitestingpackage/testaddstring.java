package junitestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstring {

	@Test
	void test() {
		junitfunction junit = new junitfunction();
		String result = junit.addStrings("ishita ","E19CSE083");
		assertEquals("ishita E19CSE083",result);
	}

}
