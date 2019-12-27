package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Random;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 147. Insertion Sort List
 * 147. 对链表进行插入排序
 *
 * @author FXYGR @date 2019-12-19
 */
public class InsertionSortListTest {

	@InjectMocks
	private InsertionSortList insertionSortList;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void insertionInsertionSortList() {
		insertionSortList(newNodeList(new int[]{4, 2, 1, 3}));

		insertionSortList(newNodeList(new int[]{4, 4, 2, 1, 3}));

		insertionSortList(newNodeList(new int[]{4, 2, 1, 3, 3}));

		insertionSortList(newNodeList(new int[]{4, 5, 2, 5, 1, 5, 3}));

		insertionSortList(newNodeList(new int[]{-1, 5, 3, 4, 0}));

		insertionSortList(newNodeList(new int[]{-1, -1, 5, 3, 4, 0, 0, 0}));

		insertionSortList(newNodeList(new int[]{new Random().nextInt()}));

		insertionSortList(newNodeList(new int[]{}));

		insertionSortList(newNodeList(null));
	}


	private InsertionSortList.ListNode newNodeList(int[] nums) {
		if (nums == null || nums.length < 1) {
			return null;
		}
		InsertionSortList.ListNode head = null, current = null;
		for (int num : nums) {
			if (head == null) {
				current = head = new InsertionSortList.ListNode(num);
			} else {
				current.setNext(new InsertionSortList.ListNode(num));
				current = current.getNext();
			}
		}
		return head;
	}

	private InsertionSortList.ListNode insertionSortList(InsertionSortList.ListNode head) {
		println(head, "Input: ");
		head = insertionSortList.insertionSortList(head);
		println(head, "Output: ");
		System.out.println();
		return head;
	}

	private void println(InsertionSortList.ListNode head, String prefix) {
		System.out.print(prefix);
		if (head == null) {
			System.out.println(head);
			return;
		}
		for (InsertionSortList.ListNode node = head; node != null; node = node.getNext()) {
			if (node != head) {
				System.out.print("->");
			}
			System.out.print(node.getVal());
		}
		System.out.println();
	}


}
