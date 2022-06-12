package com.algorithm.hash.전화번호목록;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    String[] phone_book;
    @BeforeEach
    void setUp() {
        phone_book = new String[]{"119", "97674223", "1195524421"};
    }
    @Test
    void 전화번호부확인(){
        System.out.println(solution(this.phone_book));
    }
    boolean solution(String[] phone_book){
//        int[] hashCode = geHashCode(phone_book);
        for(int i=0;i<phone_book.length;i++){
            for(int j=0;j<phone_book.length;j++){
                if(phone_book[i]!=phone_book[j]&&phone_book[i].contains(phone_book[j])) return false;
                return true;
            }
        }
        return true;
    }

    private int[] geHashCode(String[] phone_book) {
        int[] result = new int[phone_book.length];
        for(String number : phone_book){

        }
        return result;
    }

    /**75점 짜리**/
//    boolean solution(String[] phone_book){
//        for(int i=0;i<phone_book.length;i++){
//            for(int j=0;j<phone_book.length;j++){
//                if(phone_book[i]!=phone_book[j]&&phone_book[i].contains(phone_book[j])) return false;
//                return true;
//            }
//        }
//        return true;
//    }
}