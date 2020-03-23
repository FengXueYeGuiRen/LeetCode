package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 876. Middle of the Linked List
 * 876. 链表的中间结点
 *
 * @author FXYGR @date 2020-03-23
 */
public class MiddleOfTheLinkedListTest {

	@InjectMocks
	private MiddleOfTheLinkedList middleOfTheLinkedList;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void middleNode() {
		int[] nums = {1, 2, 3, 4, 5};
		ListNode middleNode = middleNode(nums);
		assertEquals(3, middleNode.val);

		nums = new int[]{1, 2, 3, 4, 5, 6};
		middleNode = middleNode(nums);
		assertEquals(4, middleNode.val);
	}

	public ListNode middleNode(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		ListNode head = ListNode.build(nums);
		ListNode middleNode = middleOfTheLinkedList.middleNode(head);

		System.out.println("Output: " + middleNode == null ? null : middleNode.val);
		System.out.println();
		return middleNode;
	}

}
