package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 2. Add Two Numbers
 * 2. 两数相加
 *
 * @author FXYGR @date 2020-02-24
 */
public class AddTwoNumbersTest {

	@InjectMocks
	private AddTwoNumbers addTwoNumbers;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void addTwoNumbers() {
		addTwoNumbers(new int[]{2, 4, 3}, new int[]{5, 6, 4});

		addTwoNumbers(new int[]{2, 4, 3}, new int[0]);

		addTwoNumbers(new int[]{2, 4, 3}, null);

		addTwoNumbers(new int[0], new int[]{5, 6, 4});

		addTwoNumbers(null, new int[]{5, 6, 4});
	}

	private void addTwoNumbers(int[] nums1, int[] nums2) {
		ListNode l1 = newNodeList(nums1);
		ListNode l2 = newNodeList(nums2);
		System.out.println("Input: (" + l1 + ") + (" + l2 + ")");

		ListNode sum = addTwoNumbers.addTwoNumbers(l1, l2);

		System.out.println("Output: " + sum);
		System.out.println();
	}

	private ListNode newNodeList(int[] nums) {
		if (nums == null) {
			return null;
		}
		ListNode head = null, current = null;
		for (int num : nums) {
			if (head == null) {
				current = head = new ListNode(num);
			} else {
				current.setNext(new ListNode(num));
				current = current.getNext();
			}
		}
		return head;
	}

}