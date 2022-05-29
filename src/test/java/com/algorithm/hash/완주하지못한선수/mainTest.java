package com.algorithm.hash.완주하지못한선수;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class mainTest {
    List<String> participant = new ArrayList<>();
    List<String> completion = new ArrayList<>();

    @BeforeEach
    void setUp() {
        participant.add("leo");
        participant.add("kiki");
        participant.add("eden");

        completion.add("eden");
        completion.add("kiki");
    }
    @Test
    void 완지하지못한자(){
        String s = completion.stream()
                        .flatMap(c->{
                            return participant.stream().filter(p->{
                                return !c.equals(p);
                            });
                        }).findFirst().toString();
        System.out.println(s);

    }
}