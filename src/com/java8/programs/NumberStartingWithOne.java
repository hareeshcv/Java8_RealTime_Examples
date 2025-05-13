package com.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> list = Arrays.asList(10, 13, 9,2,21,17);
        list.stream().
                map(l->l + "")
                .filter(l->l.startsWith("1"))
                .forEach(System.out::println);

        //Approach 2
        List<String> listString = list.stream().map(l->l + "")
                .filter(l->l.startsWith("1")).collect(Collectors.toList());
        System.out.println(listString);
    }
}
