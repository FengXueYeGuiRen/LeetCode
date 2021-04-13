package com.github.fxygr.leetcode;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 179. Largest Number
 * (https://leetcode.com/problems/largest-number/)
 * 179. 最大数
 *
 * @author FXYGR @date 2021-04-12
 **/
public class LargestNumber {

    public String largestNumber(int[] nums) {
        if (nums.length <= 1) {
            return String.valueOf(nums);
        }
        StringBuilder largestNumber = new StringBuilder();

        int max = Arrays.stream(nums).max().getAsInt();

        int digits = digits(max);

        Map<String, Integer> map =
                Arrays.stream(nums).boxed()
                        .collect(
                                Collectors.toMap(
                                        num -> rightFill(num, digits),
                                        num -> num));
        map.keySet().stream()
                .sorted((n1, n2) -> n2.compareTo(n1))
                .forEachOrdered(num -> largestNumber.append(map.get(num)));

        return largestNumber.toString();
    }

    int lowestDigit(int num) {
        return num % 10;
    }

    String rightFill(int num, int digits) {
        int lowestDigit = lowestDigit(num);
        StringBuilder pattern = new StringBuilder("#");
        for (int i = String.valueOf(num).length(); i < digits; ++i) {
            pattern.append(lowestDigit);
        }
        DecimalFormat decimalFormat = new DecimalFormat(pattern.toString());

        return decimalFormat.format(num);
    }

    int digits(int num) {
        int digits = 0;
        for (int n = num; !isDigit(n); n = num / 10) {
            ++digits;
        }
        return ++digits;
    }

    int highestDigit(int num) {
        int highestDigit;
        for (int n = num; ; n = num / 10) {
            if (isDigit(n)) {
                highestDigit = n;
                break;
            }
        }
        return highestDigit;
    }

    boolean isDigit(int num) {
        return num <= 9;
    }

}
