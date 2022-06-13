package com.algorithm.hash.전화번호목록;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class mainTest {
    String[] phone_book;
    LinkedList<Hashtable>[] list;
    @BeforeEach
    void setUp() {
        phone_book = new String[]{"123", "456", "789"};
        list = new LinkedList[phone_book.length];
    }
    @Test
    void 전화번호부확인(){
        System.out.println(solution(this.phone_book));

    }
    boolean solution(String[] phone_book){
        int minLength = 0;
        for(String i : phone_book){
            if(minLength==0||i.length()<minLength)
                minLength = i.length();
        }
        System.out.println(phone_book[0].substring(0,1));
        LinkedList<String>[] linkedLists = getHashTable(phone_book,minLength);
        return true;
    }

    private LinkedList<String>[] getHashTable(String[] phone_book, int minLength) {
        LinkedList<String>[] result = new LinkedList[phone_book.length];

        for(String s: phone_book){

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