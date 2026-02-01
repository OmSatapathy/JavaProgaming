package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = { 55, 45, 44, 56, 55, 58, 53, 56, 61 };


        Arrays.sort(arr);


        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }


        List<Integer> list = new ArrayList<>(set);

        int secondLargest = list.get(list.size() - 2);

        System.out.println("Second largest number: " + secondLargest);
    }
}








