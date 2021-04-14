package com.java.revision;

public class ReverseString {
    private static String reverseString(final String data) {
        if (data == null || data.isEmpty()) {
            return "";
        }

        if (data.length() == 1) {
            return data;
        }

        char cStr[] = data.toCharArray();
        int loop = (data.length()/2) - 1;
        int j = data.length() - 1;
        for (int i=0; i < loop; i++) {
            char temp = cStr[i];
            cStr[i] = cStr[j];
            cStr[j] = temp;
            j--;
        }
        return String.valueOf(cStr);
    }

    public static void testReverseString(final String data) {
        System.out.println(reverseString(data));
    }
}
