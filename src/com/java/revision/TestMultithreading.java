package com.java.revision;

import com.java.revision.multithreading.ExtendThread;
import com.java.revision.multithreading.ImplementRunnable;

public class TestMultithreading {

    public static void testExtendThread() {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new ExtendThread());
            thread.start();
        }
    }

    public static void testImplementRunnable() {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new ImplementRunnable());
            thread.start();
        }
    }
}
