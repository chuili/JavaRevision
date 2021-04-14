package com.java.revision.multithreading;

import java.text.MessageFormat;

public class ExtendThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(MessageFormat.format("Thread {0} is running", Thread.currentThread().getId()));
        } catch (Exception ex) {
            System.out.println("Exception is caught");
        }
    }
}
