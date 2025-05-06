package com.employee.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalOrderString {
    public static void main(String[] args) {
        String str = "Java is programming language and java is objet oriented programming";
        //print above string in alphabetical order
        List<String> alphaString = Arrays.stream(str.split(" ")).map(String::toLowerCase)
                .distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(alphaString);
    }
}
