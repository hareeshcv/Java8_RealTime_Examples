package com.java8.programs;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        //Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> list = Arrays.asList(16,12,14,8,90,123);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
