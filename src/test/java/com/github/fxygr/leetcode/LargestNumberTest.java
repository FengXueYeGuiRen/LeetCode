package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.openMocks;

/**
 * 179. Largest Number
 * (https://leetcode.com/problems/largest-number/)
 * 179. 最大数
 */
public class LargestNumberTest {

    @InjectMocks
    private LargestNumber largestNumber;

    @Before
    public void setUp() throws Exception {
        openMocks(this);
    }

    @Test
    public void largestNumber() {
        int[] nums = new int[]{10, 2};
        String largestNum = largestNumber.largestNumber(nums);
        assertEquals("210", largestNum);

        nums = new int[]{3, 30, 34, 5, 9};
        largestNum = largestNumber.largestNumber(nums);
        assertEquals("9534330", largestNum);

        nums = new int[]{1};
        largestNum = largestNumber.largestNumber(nums);
        assertEquals("1", largestNum);

        nums = new int[]{10};
        largestNum = largestNumber.largestNumber(nums);
        assertEquals("10", largestNum);
    }

    @Test
    public void rightFill() {
        System.out.println(largestNumber.rightFill(98, 4));
    }

}