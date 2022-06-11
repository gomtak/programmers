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
        lost = new int[]{2,4};
        reserve = new int[]{1,3,5};
    }
    @Test
    void 체육수업들을수있는학생수(){
        int result = n-lost.length;
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(reserve[j]==lost[i]-1){
                    result++;
                    int index = Arrays.binarySearch(reserve,reserve[j]);
                    reserve = removeArray(reserve,index);
                    break;
                }else if(reserve[j]==lost[i]){
                    result++;
                    int index = Arrays.binarySearch(reserve,reserve[j]);
                    reserve = removeArray(reserve,index);
                    break;
                }else if(reserve[j]==lost[i]+1){
                    result++;
                    int index = Arrays.binarySearch(reserve,reserve[j]);
                    reserve = removeArray(reserve,index);
                    break;
                };
            }
        }
        System.out.println(result);
    }
    int[] removeArray(int[] array, int index){
//        System.out.println("remove start");
//        System.out.println(Arrays.toString(array));
//        System.out.println(index);
        int[] result = new int[array.length-1];
        for(int i=0;i<result.length;i++){
            if(i>=index){
                result[i]=array[i+1];
            }else{
                result[i]=array[i];
            }
        }
//        System.out.println(Arrays.toString(result));
//        System.out.println("remove end");
        return result;
    }
}