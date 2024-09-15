package com.myhouse.java_oop.util;

import java.util.function.Function;

public class TPStream {
    public static void main(String[] args) {
        Function<String, String> a = (String b) -> "Salut " + b;
       System.out.println(a.apply("bob"));
    }
}
