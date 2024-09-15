package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,56,7,8,4,5);
        List<Integer> val = data.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(val);
        System.out.println("hello");

    }

}
