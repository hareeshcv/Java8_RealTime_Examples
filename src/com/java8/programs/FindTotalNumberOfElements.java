package com.java8.programs;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumberOfElements {
    public static void main(String[] args) {
        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> list = Arrays.asList(16,12,14,8,90,123);
        long count = list.stream().count();
        System.out.println(count);
    }
}
