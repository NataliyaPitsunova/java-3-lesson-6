package com.geekbrains.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Java3hw6 {
//упражнение 2
    public List<Integer> findIntegers(Integer[] integers) {
        List<Integer> results = new ArrayList<>();
        int lastIndx = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == 4) {
                lastIndx = i;
            }
        }
        if (lastIndx == 0) {
            throw new RuntimeException("В МАССИВЕ НИ ОДНОЙ ЦИФРЫ 4");
        }
        return Arrays.asList(integers).stream()
                .skip(lastIndx + 1)
                .collect(Collectors.toList());
    }

//упражнение 3
    public boolean task2(Integer[] arr) {
        List<Integer> distinctInts = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
        return (distinctInts.size() == 2);

    }
}
