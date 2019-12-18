package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Random;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 148. Sort List
 * 148. 排序链表
 *
 * @author FXYGR @date 2019-12-18
 */
public class SortListTest {

	@InjectMocks
	private SortList sortList;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void sortList() {
		sortList(newNodeList(new int[]{4, 2, 1, 3}));

		sortList(newNodeList(new int[]{4, 4, 2, 1, 3}));

		sortList(newNodeList(new int[]{4, 2, 1, 3, 3}));

		sortList(newNodeList(new int[]{4, 5, 2, 5, 1, 5, 3}));

		sortList(newNodeList(new int[]{-1, 5, 3, 4, 0}));

		sortList(newNodeList(new int[]{-1, -1, 5, 3, 4, 0, 0, 0}));

		sortList(newNodeList(new int[]{new Random().nextInt()}));

		sortList(newNodeList(new int[]{}));

		sortList(newNodeList(null));
	}

	private SortList.ListNode newNodeList(int[] nums) {
		if (nums == null || nums.length < 1) {
			return null;
		}
		SortList.ListNode head = null, current = null;
		for (int num : nums) {
			if (head == null) {
				current = head = new SortList.ListNode(num);
			} else {
				current.setNext(new SortList.ListNode(num));
				current = current.getNext();
			}
		}
		return head;
	}

	private SortList.ListNode sortList(SortList.ListNode head) {
		println(head, "Input: ");
		head = sortList.sortList(head);
		println(head, "Output: ");
		System.out.println();
		return head;
	}

	private void println(SortList.ListNode head, String prefix) {
		System.out.print(prefix);
		if (head == null) {
			System.out.println(head);
			return;
		}
		for (SortList.ListNode node = head; node != null; node = node.getNext()) {
			if (node != head) {
				System.out.print("->");
			}
			System.out.print(node.getVal());
		}
		System.out.println();
	}

}