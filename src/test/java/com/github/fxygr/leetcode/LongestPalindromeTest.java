package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 409. Longest Palindrome
 * 409. 最长回文串
 *
 * @author FXYGR @date 2020-03-19
 */
public class LongestPalindromeTest {

	@InjectMocks
	private LongestPalindrome longestPalindrome;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void longestPalindrome() {
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		int longest = longestPalindrome(s);
		assertEquals(983, longest);

		s = "bb";
		longest = longestPalindrome(s);
		assertEquals(2, longest);

		s = "a";
		longest = longestPalindrome(s);
		assertEquals(1, longest);

		s = "abccccdd";
		longest = longestPalindrome(s);
		assertEquals(7, longest);
	}

	private int longestPalindrome(String s) {
		System.out.println("Input: " + s);

		int longest = longestPalindrome.longestPalindrome(s);

		System.out.println("Output: " + longest);
		System.out.println();
		return longest;
	}

}
