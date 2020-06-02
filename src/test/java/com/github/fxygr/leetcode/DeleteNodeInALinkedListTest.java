package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 237. Delete Node in a Linked List
 * 237. 删除链表中的节点
 *
 * @author FXYGR @date 2020-06-02
 */
public class DeleteNodeInALinkedListTest {

	@InjectMocks
	private DeleteNodeInALinkedList deleteNodeInALinkedList;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void deleteNode() {
		int[] nums = new int[]{5, 1, 9};
		Integer[] results = deleteNode(nums);
		assertArrayEquals(new Integer[]{1, 9}, results);
	}

	private ListNode createListNode(int[] nums) {
		int i = 0;
		ListNode currentNode = new ListNode(nums[i++]);

		ListNode node = currentNode;
		while (i < nums.length) {
			currentNode.next = new ListNode(nums[i++]);
			currentNode = currentNode.next;
		}
		return node;
	}

	private List<Integer> list(ListNode node) {
		List<Integer> nums = new LinkedList<>();

		ListNode currentNode = node;
		for (; currentNode != null; currentNode = currentNode.next) {
			nums.add(currentNode.val);
		}
		return nums;
	}

	private Integer[] deleteNode(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		ListNode node = createListNode(nums);
		deleteNode(node);

		List<Integer> results = list(node);

		Integer[] resultNums = new Integer[results.size()];
		results.toArray(resultNums);

		System.out.println("Output: " + results);
		System.out.println();

		return resultNums;
	}

	private void deleteNode(ListNode node) {
		deleteNodeInALinkedList.deleteNode(node);
	}

}
