package com.java.revision.singleton;

import java.io.*;

public class ClassSingleton implements Serializable {
    private static ClassSingleton INSTANCE = new ClassSingleton();
    private static int value;

    private ClassSingleton() {

    }

    public static ClassSingleton getINSTANCE() {
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        ClassSingleton.value = value;
    }

//    public void testSingleton() {
//        ClassSingleton singleton = ClassSingleton.getINSTANCE();
//        singleton.setValue(1);
//
//        // Serialize
//        try {
//            FileOutputStream fileOut = new FileOutputStream("out.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(singleton);
//            out.close();
//            fileOut.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        singleton.setValue(2);
//
//        // Deserialize
//        ClassSingleton singleton2 = null;
//        try {
//            FileInputStream fileIn = new FileInputStream("out.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            singleton2 = (ClassSingleton) in.readObject();
//            in.close();
//            fileIn.close();
//        } catch (IOException i) {
//            i.printStackTrace();
//        } catch (ClassNotFoundException c) {
//            System.out.println("singletons.SingletonEnum class not found");
//            c.printStackTrace();
//        }
//
//        if (singleton == singleton2) {
//            System.out.println("Two objects are same");
//        } else {
//            System.out.println("Two objects are not same");
//        }
//
//        System.out.println(singleton.getValue());
//        System.out.println(singleton2.getValue());
//    }
}
