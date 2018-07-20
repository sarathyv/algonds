package com.company.algonds.java;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.class.getClassLoader());
        System.out.println(Logging.class.getClassLoader());
        System.out.println(ArrayList.class.getClassLoader());
    }
}
