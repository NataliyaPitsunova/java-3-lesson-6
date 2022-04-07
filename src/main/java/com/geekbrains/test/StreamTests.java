package com.geekbrains.test;

import com.geekbrains.stream.Java3hw6;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class StreamTests {
    private static Java3hw6 java3hw6;

    @BeforeAll
    public static void init() {
        java3hw6 = new Java3hw6();
    }


    @Test
    public void testTask11() {
        List<Integer> list1 = java3hw6.findIntegers(new Integer[]{1, 2, 3, 4, 5, 4, 7, 8});
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(List.of(new Integer[]{7, 8}));

        Assertions.assertArrayEquals(list1.toArray(), list2.toArray());
    }



    @Test
    public void testTask12() {
        List<Integer> list1 = java3hw6.findIntegers(new Integer[]{1, 4, 3, 4, 5, 2, 7, 8});
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(List.of(new Integer[]{ 5, 2, 7, 8}));

        Assertions.assertArrayEquals(list1.toArray(), list2.toArray());
    }

    @Test // не уверена что правильный тест не поняла как ошиьку выкидывать чтоб тест был пройден
    public void testTask13() {
        List<Integer> list1 = java3hw6.findIntegers(new Integer[]{1, 1, 3, 1, 5, 2, 7, 8});
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(List.of(new Integer[]{}));

        Assertions.assertArrayEquals(list1.toArray(), list2.toArray());
    }

    @Test
    public void testTask21() {
        boolean result = java3hw6.task2(new Integer[]{1,1,1,4,4,4});
        Assertions.assertEquals(result, true);
    }

    @Test
    public void testTask22() {
        boolean result = java3hw6.task2(new Integer[]{1,1,1});
        Assertions.assertEquals(result, false);
    }
@Test
    public void testTask23() {
        boolean result = java3hw6.task2(new Integer[]{4,4,4});
        Assertions.assertEquals(result, false);
    }


}


