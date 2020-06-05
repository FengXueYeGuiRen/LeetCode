package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 6. ZigZag Conversion
 * 6. Z 字形变换
 *
 * @author FXYGR @date 2020-06-05
 */
public class ZigZagConversionTest {

	@InjectMocks
	private ZigZagConversion zigZagConversion;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void convert() {
	}

	private String convert(String s, int numRows) {
		System.out.println("Input: s = " + s + ", numRows = " + numRows);

		String conversion = zigZagConversion.convert(s, numRows);

		System.out.println("Output: " + conversion);
		System.out.println();
		return conversion;
	}

}
