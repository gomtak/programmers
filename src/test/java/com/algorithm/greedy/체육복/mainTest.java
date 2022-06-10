package com.algorithm.greedy.체육복;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    int n;
    int[] lost;
    int[] reserve;
    @BeforeEach
    void setUp() {
        n=5;
        lost = new int[]{2, 4};
        reserve = new int[]{1, 3, 5};
    }
    @Test
    void 들을수있는학생수(){
        int result = n-lost.length;
        System.out.println(Arrays.binarySearch(lost,4));
//        Arrays.stream(lost)
//                .map();
    }
}