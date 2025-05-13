package com.java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args){
        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10, 13, 9,2,21,17);
        System.out.println("---Even Numbers ---");
        list.stream().filter(l->l%2==0).forEach(System.out::println);

        System.out.println("Odd Numbers-------");
        list.stream().filter(l->l%2!=0).forEach(System.out::println);

        //Approah 2: using Map interface
        Map<Boolean, List<Integer>> mapList = list.stream().
                collect(Collectors.partitioningBy(l->l%2==0));
       System.out.println(mapList);
    }
}
