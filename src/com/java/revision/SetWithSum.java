package com.java.revision;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class SetWithSum {

    private static Map hasSum(final int arr[], final int sum) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Map<Integer, Integer> set = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.containsKey(arr[i])) {
                result.put(set.get(arr[i]), arr[i]);
            }
            else {
                set.put(sum - arr[i], arr[i]);
            }
        }
        return result;
    }

    public static void testSetWithSum(final int arr[], final int sum) {
        Map<Integer, Integer> set = hasSum(arr, sum);
        if (set != null && !set.isEmpty()) {
            System.out.println("Set with given sum:");
            set.forEach((key, value) -> System.out.println(MessageFormat.format("{0}, {1}", key, value)));
        }
        else {
            System.out.println("Does not contain set with given sum");
        }
    }
}
