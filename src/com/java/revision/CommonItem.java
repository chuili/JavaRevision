package com.java.revision;

import java.util.HashMap;
import java.util.Map;

public class CommonItem {

    // 2 char arrays, common items, return boolean
    private static boolean hasCommon(final char[] arr1, final char[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false;
        }

        //O(n)
        Map<Character, Boolean> set = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            set.putIfAbsent(arr1[i], true);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.containsKey(arr2[i])) {
                return true;
            }
        }
        return false;

//        //O(n^2)
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    public static void testCommonItem(final char[] arr1, final char[] arr2) {
        System.out.println(hasCommon(arr1, arr2));
    }
}
