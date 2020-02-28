package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * description
 *
 * @author FXYGR @date 2020-02-27
 */
public class AddStringsTest {

	@InjectMocks
	private AddStrings addStrings;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void addStrings() {
		String num1 = "5";
		String num2 = "5";
		String sum = addStrings(num1, num2);
		assertEquals("10", sum);

		num1 = "1443595";
		num2 = "9406178211";
		sum = addStrings(num1, num2);
		assertEquals("9407621806", sum);

		num1 = "9";
		num2 = "1999999999";
		sum = addStrings(num1, num2);
		assertEquals("2000000008", sum);

		num1 = "0";
		num2 = "0";
		sum = addStrings(num1, num2);
		assertEquals("0", sum);

		num1 = "7243";
		num2 = "564";
		sum = addStrings(num1, num2);
		assertEquals("7807", sum);

		num1 = "7243";
		num2 = "";
		sum = addStrings(num1, num2);
		assertEquals("7243", sum);

		num1 = "7243";
		num2 = null;
		sum = addStrings(num1, num2);
		assertEquals("7243", sum);

		num1 = "";
		num2 = "564";
		sum = addStrings(num1, num2);
		assertEquals("564", sum);

		num1 = null;
		num2 = "564";
		sum = addStrings(num1, num2);
		assertEquals("564", sum);
	}

	private String addStrings(String num1, String num2) {
		System.out.println("Sources: " + num1 + " + " + num2);
		String sum = addStrings.addStrings(num1, num2);
		System.out.println("Targets: " + sum);
		System.out.println();
		return sum;
	}

}