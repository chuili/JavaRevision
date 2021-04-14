package com.java.revision;

import com.java.revision.collection.Family;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollection {

    public static void testCollection() {
        List<Family> familyList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Family family = new Family();
            family.setId(i);
            family.setPostcode((int)(Math.random() * 100000000) % 10);
            family.setOccupant((int)(Math.random() * 100000000) % 9);
            familyList.add(family);
            System.out.println(family.toString());
        }

        Map<Integer, Family> biggestFamily =
        familyList.stream()
                .collect(Collectors.groupingBy(
                        f -> f.getPostcode(),
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(f -> f.getOccupant())), Optional::get)));

        String familyStr = biggestFamily.entrySet()
                .stream()
                .map(Map.Entry::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(familyStr);
    }
}
