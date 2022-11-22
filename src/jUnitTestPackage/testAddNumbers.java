package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		int result = JUnit.AddNumber(100, 200);
		assertEquals(300, result);
	}

}
