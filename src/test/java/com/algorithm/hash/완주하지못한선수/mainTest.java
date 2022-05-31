package com.algorithm.hash.완주하지못한선수;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

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
    void 완주하지못한사람해쉬(){

    }
}