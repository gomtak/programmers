package com.algorithm.sort.K번째수;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    int[] array;
    int[][] commands;
    @BeforeEach
    void setUp() {
        array = new int[]{1, 5, 2, 6, 3, 7, 4};
        commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        /*시작위치 포함, 종료위치 포함, 요청하는 순서 값*/
    }
    @Test
    void K번째수출력(){
        System.out.println();
        int[] result = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            result[i] = answer(this.array, commands[i]);
        }
    }
    int answer(int[] array, int[] command){
        int[] arr = Arrays.copyOfRange(array,command[0]-1,command[1]);
        System.out.println(Arrays.toString(arr));
        return 0;
    }
}