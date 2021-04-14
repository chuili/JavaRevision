package com.java.revision;

import java.util.*;
import java.util.stream.Collectors;

public class JavaPractice {

    public static long largest(long arr[], long n) {
        return Arrays.stream(arr).max().getAsLong();
    }

    public static void largeButMinFreq(int arr[], int n) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            numFreq.put(arr[i], numFreq.getOrDefault(arr[i], 0) + 1);
        }

        Map.Entry max = numFreq.entrySet().stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getKey())), Optional::get));
        System.out.println("key: " + max.getKey() + "   value: " + max.getValue());
    }

    public int map(final int n, final String keys[], final int arr[], final String s) {
        if (n == 0 || keys == null || keys.length != n || arr == null || arr.length != n) {
            return -1;
        }

        Map<String, Integer> keyValue = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!keyValue.containsKey(keys[i])) {
                keyValue.put(keys[i], arr[i]);
            }
        }

        if (keyValue.containsKey(s)) {
            return keyValue.get(s);
        }
        return -1;
    }
}
