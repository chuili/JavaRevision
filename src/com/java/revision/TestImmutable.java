package com.java.revision;

import com.java.revision.immutable.Employee;

import java.util.HashMap;
import java.util.Map;

public class TestImmutable {

    public static void testImmutable() {
        Map<String, String> additionalInfo = new HashMap<>();
        additionalInfo.put("Address", "56, abc st, 12345.");
        additionalInfo.put("Gender", "Male");
        Employee alex = new Employee(123,"Alex", 1,8000.00,  additionalInfo);
        additionalInfo.put("Birth date", "1 Jan 1990");
        System.out.println(alex.toString());
    }
}
