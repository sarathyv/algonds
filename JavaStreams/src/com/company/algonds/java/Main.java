package com.company.algonds.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] test = {"a1", "a2", "a3", "a4"};
        List<String> myList = Arrays.asList("a1", "a2", "a3", "a4");
        Stream.of(test)
                .filter(s -> !s.equalsIgnoreCase("a2"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(s -> System.out.println(s + "test"));



	// write your code here
    }
}
