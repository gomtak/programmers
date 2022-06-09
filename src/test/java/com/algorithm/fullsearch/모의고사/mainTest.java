package com.algorithm.fullsearch.모의고사;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    int[] answers;

    @BeforeEach
    void setUp() {
        answers = new int[]{1,3,2,4,2};
    }

    @Test
    void 등수세우기(){
        int[] result = new int[0];
        int one = numberOne(this.answers);
        int two = numberTwo(this.answers);
        int three = numberThree(this.answers);
        if(one>two){
            if(one>three){
                result = new int[]{1};
            }else if(one==three){
                result = new int[]{1,3};
            }else if(one<three){
                result = new int[]{3};
            }
        }else if(one<two){
            if(two>three){
                result = new int[]{2};
            }else if(two<three){
                result = new int[]{3};
            }else if(two==three){
                result = new int[]{2,3};
            }
        }else if(one==two){
            if(two>three){
                result = new int[]{1,2};
            }else if(two<three){
                result = new int[]{3};
            }else if(two==three){
                result = new int[]{1,2,3};
            }
        }
        System.out.println(Arrays.toString(result));
    }
    int numberOne(int[] answers){
        int count = 0;
        int[] answerSheet = {1,2,3,4,5};
        int j = 0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==answerSheet[j]){
                count++;
            }
            j++;
            if(j==5) j=0;
        }
        return count;
    }
    int numberTwo(int[] answers){
        int count = 0;
        int[] answerSheet = {2, 1, 2, 3, 2, 4, 2, 5};
        int j = 0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==answerSheet[j]){
                count++;
            }
            j++;
            if(j==8) j=0;
        }
        return count;
    }
    int numberThree(int[] answers){
        int count = 0;
        int[] answerSheet = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int j = 0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==answerSheet[j]){
                count++;
            }
            j++;
            if(j==10) j=0;
        }
        return count;
    }
}