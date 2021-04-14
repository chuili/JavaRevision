package com.java.revision.singleton;

public enum EnumSingleton {
    INSTANCE;

    private static int value;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        EnumSingleton.value = value;
    }
}
