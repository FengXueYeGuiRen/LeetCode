package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 468. Validate IP Address
 * 468. 验证IP地址
 *
 * @author FXYGR @date 2020-06-16
 */
public class ValidateIPAddressTest {

	@InjectMocks
	private ValidateIPAddress validateIPAddress;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void validIPAddress() {
		String ip = "2001:0db8:85a3:0000:0:8A2E:0370:733a";
		String validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.IPv6, validIPAddress);

		ip = "1e1.4.5.6";
		validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.NEITHER, validIPAddress);

		ip = "2001:0db8:85a3:0:0:8A2E:0370:7334:";
		validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.NEITHER, validIPAddress);

		ip = "172.16.254.1";
		validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.IPv4, validIPAddress);

		ip = "02001:0db8:85a3:0000:0000:8a2e:0370:7334";
		validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.NEITHER, validIPAddress);

		ip = "2001:0db8:85a3:0:0:8A2E:0370:7334";
		validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.IPv6, validIPAddress);

		ip = "256.256.256.256";
		validIPAddress = validIPAddress(ip);
		assertEquals(ValidateIPAddress.NEITHER, validIPAddress);
	}

	private String validIPAddress(String ip) {
		System.out.println("Input: " + ip);

		String validIPAddress = validateIPAddress.validIPAddress(ip);

		System.out.println("Output: " + validIPAddress);
		System.out.println();
		return validIPAddress;
	}

}
