package com.java.revision.hashtable;

import java.util.ArrayList;
import java.util.List;

public class MyHashTable {

    private final int length;
    private final MyNode[] data;

    public MyHashTable(final int size) {
        length = size;
        data = new MyNode[size];
    }

    private int _hash(final String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % length;
        }
        return hash;
    }

    public void set(final String key, int value) {
        if (data[_hash(key)] == null) {
            data[_hash(key)] = new MyNode();
        }
        data[_hash(key)].add(new MyNode(key, value));
    }

    public int get (final String key) {
        if (data[_hash(key)] == null) {
            return 0;
        }

        for (MyNode node : data[_hash(key)]) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }

        return 0;
    }

    public List<String> keys() {
        List<String> keys = new ArrayList<>();
        for (int i = 0; i <length; i++) {
            if (data[i] != null) {
                for (int j = 0; j < data[i].size(); j++) {
                    keys.add(data[i].get(j).getKey());
                }
            }
        }
        return keys;
    }
}
