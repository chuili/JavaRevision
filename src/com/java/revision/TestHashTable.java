package com.java.revision;

import com.java.revision.hashtable.MyHashTable;

public class TestHashTable {

    public static void testHashTable() {
        MyHashTable table = new MyHashTable(50);
        table.set("grapes", 1000);
        table.set("apples", 24);
        table.set("oranges", 5);
        System.out.println(table.keys().size());
        System.out.println(table.get("grapes"));
        System.out.println(table.get("apples"));
        System.out.println(table.get("oranges"));
        table.keys().stream().forEach(key -> System.out.println(key));
    }
}
