package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 67. Add Binary
 * 67. 二进制求和
 *
 * @author FXYGR @date 2020-02-29
 */
public class AddBinaryTest {

	@InjectMocks
	private AddBinary addBinary;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void addBinary() {
		String a = "11";
		String b = "1";
		String sum = addBinary(a, b);
		assertEquals("100", sum);

		a = "1010";
		b = "1011";
		sum = addBinary(a, b);
		assertEquals("10101", sum);

		a = "1010";
		b = "";
		sum = addBinary(a, b);
		assertEquals("1010", sum);

		a = "1010";
		b = null;
		sum = addBinary(a, b);
		assertEquals("1010", sum);

		a = "";
		b = "1011";
		sum = addBinary(a, b);
		assertEquals("1011", sum);

		a = null;
		b = "1011";
		sum = addBinary(a, b);
		assertEquals("1011", sum);

		a = null;
		b = null;
		sum = addBinary(a, b);
		assertEquals(null, sum);
	}

	public String addBinary(String a, String b) {
		System.out.println("Sources: " + a + " + " + b);
		String sum = addBinary.addBinary(a, b);
		System.out.println("Targets: " + sum);
		System.out.println();
		return sum;
	}

}
