package com.java8.programs;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        // Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> firstElements = Arrays.asList(12,14,8,90,123);
        firstElements.stream().findFirst().ifPresent(System.out::println);

        //Approach 2
        System.out.println("Approach two");
        int[] arr = {16,12,14,8,90,123};
        Arrays.stream(arr).findFirst().ifPresent(System.out::println);

    }
}
