package com.java.revision.immutable;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public final class Employee {
    private final int id;
    private final String name;
    private final int departmentId;
    private final double salary;
    private final Map<String, String> additionalInfo;

    public Employee(final int id, final String name, final int departmentId,
                    final double salary, final Map<String, String> additionalInfo) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
        Map<String, String> temp = new HashMap<>();
        additionalInfo.forEach((k, v) -> temp.put(k, v));
        this.additionalInfo = temp;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getAdditionalInfo() {
        Map<String, String> temp = new HashMap<>();
        additionalInfo.forEach((k, v) -> temp.put(k, v));
        return temp;
    }

    @Override
    public String toString() {
        String additionalInfoStr = additionalInfo.entrySet().stream().map(Map.Entry::toString).collect(joining("\n"));
        String employeeStr = MessageFormat.format("Employee ID: {0}\nName: {1}\nDepartment ID: {2}\nSalary: {3}\nAdditional Info: \n{4}",
                id, name, departmentId, salary, additionalInfoStr);
        return employeeStr;
    }
}
