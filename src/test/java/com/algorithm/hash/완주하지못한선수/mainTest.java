package com.algorithm.hash.완주하지못한선수;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class mainTest {
    List<String> participant = new ArrayList<>();

    @BeforeEach
    void setUp() {
        participant.add("leo");
        participant.add("kiki");
        participant.add("eden");
    }
    @Test
    void 출전선수출력(){
        System.out.println(participant);
        assertThat(participant).isInstanceOf(List.class)
                .contains("kim");
    }
}