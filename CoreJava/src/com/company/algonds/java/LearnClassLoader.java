package com.company.algonds.java;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

public class LearnClassLoader {

    public static void main(String[] args) {
        System.out.println(LearnClassLoader.class.getClassLoader());
        System.out.println(Logging.class.getClassLoader());
        System.out.println(ArrayList.class.getClassLoader());
    }
}
