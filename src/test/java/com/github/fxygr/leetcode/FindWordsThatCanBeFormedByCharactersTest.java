package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * 1160. 拼写单词
 *
 * @author FXYGR @date 2020-03-17
 */
public class FindWordsThatCanBeFormedByCharactersTest {

	@InjectMocks
	private FindWordsThatCanBeFormedByCharacters findWordsThatCanBeFormedByCharacters;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void countCharacters() {
		String[] words = {"boygirdlggnh", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo"};
		String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
		int count = countCharacters(words, chars);
		assertEquals(0, count);

		words = new String[]{"cat", "bt", "hat", "tree"};
		chars = "atach";
		count = countCharacters(words, chars);
		assertEquals(6, count);

		words = new String[]{"hello", "world", "leetcode"};
		chars = "welldonehoneyr";
		count = countCharacters(words, chars);
		assertEquals(10, count);
	}

	private int countCharacters(String[] words, String chars) {
		System.out.println("Input: words = " + Arrays.toString(words) + ", chars = " + chars);
		int count = findWordsThatCanBeFormedByCharacters.countCharacters(words, chars);

		System.out.println();
		System.out.println("Output: " + count);
		System.out.println();
		return count;
	}

}
