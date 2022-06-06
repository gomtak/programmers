package com.algorithm.hash.완주하지못한선수;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class mainTest {
    String[] participant;
    String[] completion;

    @BeforeEach
    void setUp() {
        participant = new String[4];
        participant[0]=("leo");
        participant[1]=("kiki");
        participant[2]=("kiki");
        participant[3]=("eden");
        completion = new String[2];
        completion[0]=("eden");
        completion[1]=("kiki");
    }

    @Test
    void 완주하지못한사람해쉬() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        int index = 0;
        for (String t : participant) {
            if(hashtable.get(t)==null){
                hashtable.put(t, 1);
            }else{
                hashtable.put(t,hashtable.get(t)+1);
            }
            index++;
            System.out.println(hashtable);
        }
    }
}