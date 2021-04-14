package com.java.revision;

import java.util.Arrays;

public class MergeSortedArrays {

    // Given 2 sorted arrays
    private static int[] mergeSortedArrays(final int[] arr1, final int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }

        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }

        int[] mergedArr = new int[arr1.length + arr2.length];
        int arr1Index = 0;
        int arr2Index = 0;
        int mergedArrIndex = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                mergedArr[mergedArrIndex++] = arr1[arr1Index++];
            }
            else {
                mergedArr[mergedArrIndex++] = arr2[arr2Index++];
            }
        }

        while (arr1Index < arr1.length) {
            mergedArr[mergedArrIndex++] = arr1[arr1Index++];
        }

        while (arr2Index < arr2.length) {
            mergedArr[mergedArrIndex++] = arr2[arr2Index++];
        }

        return mergedArr;
    }

    public static void testMergeSortedArrays(final int[] arr1, final int[] arr2) {
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }
}
