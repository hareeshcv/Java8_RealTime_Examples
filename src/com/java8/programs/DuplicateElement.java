package com.java8.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        //How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> elements = Arrays.asList(2,4,6,8,19,10,2,6,8);
        Set<Integer> set = new HashSet<>();
        elements.stream().filter(e->!set.add(e)).forEach(System.out::println);
    }
}
