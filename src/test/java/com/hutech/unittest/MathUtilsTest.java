package com.hutech.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mt=new MathUtils();
		int expected=3;
		int actual=mt.add(2, 1);
		assertEquals(expected, actual);
	}

}
