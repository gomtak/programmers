package com.algorithm.hash.완주하지못한선수;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class mainTest {
    String[] participant;
    String[] completion;

    @BeforeEach
    void setUp() {
        participant = new String[3];
        participant[0]=("leo");
        participant[1]=("kiki");
        participant[2]=("eden");
        completion = new String[2];
        completion[0]=("eden");
        completion[1]=("kiki");
    }

    @Test
    void 완주하지못한사람해쉬() {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        int index = 0;
        for(String t : participant) {
            hashtable.put(t,hashtable.getOrDefault(t,0)+1);
            index++;
        }
        for(String t : completion){
            if(hashtable.get(t)!=0){
                hashtable.put(t,hashtable.get(t)-1);
            }
            if(hashtable.get(t)==0){
                hashtable.remove(t);
            }
        }
//        System.out.println(hashtable.keySet());
        for(String t : participant){
            if(hashtable.get(t)!=null){
                System.out.println(t);
            }
        }
    }
}