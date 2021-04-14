package com.java.revision.hashtable;

import java.util.ArrayList;

public class MyNode extends ArrayList<MyNode> {

    private String key;
    private int value;

    public MyNode() {

    }

    public MyNode(final String key, final int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
