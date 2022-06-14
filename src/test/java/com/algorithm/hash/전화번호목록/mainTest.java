package com.algorithm.hash.전화번호목록;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class mainTest {
    String[] phone_book;
    @BeforeEach
    void setUp() {
        phone_book = new String[]{"123", "456", "789"};
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
        Hashtable<String,ArrayList<String>> hashtable = getHashTable(phone_book,minLength);
        if(phone_book.length != hashtable.size())
            return false;
        return true;
    }

    private Hashtable<String,ArrayList<String>> getHashTable(String[] phone_book, int minLength) {
        Hashtable<String,ArrayList<String>> result = new Hashtable<>();
        for(String s: phone_book){
            if(result.get(s.substring(0,minLength))==null){
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                result.put(s.substring(0,minLength),temp);
            }else{
                ArrayList<String> temp = result.get(s.substring(0,minLength));
                temp.add(s);
                result.put(s.substring(0,minLength),temp);
            }
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
    private static class Node {
        private String key;
        private String value;

        private Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}