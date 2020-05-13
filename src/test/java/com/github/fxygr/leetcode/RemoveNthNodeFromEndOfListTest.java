package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 19. Remove Nth Node From End of List
 * 19. 删除链表的倒数第N个节点
 *
 * @author FXYGR @date 2020-05-13
 */
public class RemoveNthNodeFromEndOfListTest {

	@InjectMocks
	private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void removeNthFromEnd() {
		int[] nums = new int[]{1, 2, 3, 4, 5};
		int n = 5;
		ListNode head = removeNthFromEnd(nums, n);
		assertEquals("2 -> 3 -> 4 -> 5", head.toString());

		nums = new int[]{1, 2, 3, 4, 5};
		n = 1;
		head = removeNthFromEnd(nums, n);
		assertEquals("1 -> 2 -> 3 -> 4", head.toString());

		nums = new int[]{1, 2, 3, 4, 5};
		n = 2;
		head = removeNthFromEnd(nums, n);
		assertEquals("1 -> 2 -> 3 -> 5", head.toString());
	}

	private ListNode removeNthFromEnd(int[] nums, int n) {
		return removeNthFromEnd(ListNode.build(nums), n);
	}

	private ListNode removeNthFromEnd(ListNode head, int n) {
		System.out.println("Input: " + head + ", " + n);
		ListNode node = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);

		System.out.println("Output: " + node);
		System.out.println();
		return node;
	}

}
