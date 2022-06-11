package com.algorithm.greedy.체육복;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class mainTest {
    int n;
    int[] lost;
    int[] reserve;
    @BeforeEach
    void setUp() {
        n=5;
        lost = new int[]{2,4,5};
        reserve = new int[]{1,3,5};
    }
    @Test
    void 체육수업들을수있는학생수() {
        int answer = n;
        int []student = new int[n];
        Arrays.fill(student, 1);
        for (int i : lost)
            student[i - 1] -= 1;
        for (int i : reserve)
            student[i - 1] += 1;
        for (int i = 0; i < student.length; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) {
                    student[i - 1] -= 1;
                    student[i] += 1;
                }
                else if (i < n - 1 && student[i + 1] == 2) {
                    student[i + 1] -= 1;
                    student[i] += 1;
                }
                else {
                    answer--;
                }
            }
        }
        System.out.println(Arrays.toString(student));
        System.out.println(answer);
    }
}