package com.company.algonds.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpr {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple","blueberry","catlin","alligator");
        Collections.sort(input, ( a,  b) -> a.compareTo(b));
        System.out.println(input);
    }
}
