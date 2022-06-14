package com.algorithm.hash.전화번호목록;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

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
    public boolean solution(String[] phoneBook) {
        boolean answer = true;

        Try aTry = new Try();
        Arrays.sort(phoneBook);

        for(int i = 0; i < phoneBook.length; i++) {

            if(!aTry.Insert(phoneBook[i])) {

                answer = false;
                break;
            }
        }

        return answer;
    }
}

class Try {

    private TryNode root;

    Try() {

        root = new TryNode('\u0000');
    }

    public boolean search(String word) {

        TryNode temp = root;

        for (char ch : word.toCharArray()) {

            if(temp.terminal)
                return true;
            if (temp.subNode(ch) == null)
                return false;

            temp = temp.subNode(ch);
        }
        boolean ret = temp.terminal;
        char ch = word.charAt(word.length() - 1);

        while(temp != null) {
            temp = temp.subNode(ch);

            if(temp.terminal)
                return true;
        }

        return ret;
    }

    public boolean Insert(String word) {

        if (search(word))
            return false;

        TryNode temp = root;

        for (char ch : word.toCharArray() ) {
            TryNode child = temp.subNode(ch);

            if (child != null) {
                temp = child;
            }
            else {
                temp.list.add(new TryNode(ch));
                temp = temp.subNode(ch);
            }
        }

        return temp.terminal = true;
    }
}

class TryNode implements Comparable<TryNode> {

    char nodeChar;
    boolean terminal;
    LinkedList<TryNode> list;

    TryNode(char nodeChar) {

        this.nodeChar = nodeChar;
        this.terminal = false;
        list = new LinkedList<>();
    }

    public TryNode subNode(char nextChar) {

        if (list != null) {
            for (TryNode eachChild : list)
                if (eachChild.nodeChar == nextChar)
                    return eachChild;
        }

        return null;
    }

    @Override
    public int compareTo(TryNode other) {
        return this.nodeChar > other.nodeChar ? 1 : (this.nodeChar == other.nodeChar ? -1 : 0);
    }

    /**통과코드**/
//    boolean solution(String[] phone_book){
//        Arrays.sort(phone_book);
//        boolean result = true;
//        for (int i=0; i<phone_book.length-1; i++) {
//            if (phone_book[i+1].startsWith(phone_book[i])) {
//                result = false;
//                break;
//            }
//        }
//        return result;
//    }

    /**91점 짜리**/
//    boolean solution(String[] phone_book){
//        int minLength = 0;
//        for(String i : phone_book){
//            if(minLength==0||i.length()<minLength)
//                minLength = i.length();
//        }
//        Hashtable<String,ArrayList<String>> hashtable = getHashTable(phone_book,minLength);
//        if(phone_book.length != hashtable.size())
//            return false;
//        return true;
//    }
//
//    private Hashtable<String,ArrayList<String>> getHashTable(String[] phone_book, int minLength) {
//        Hashtable<String,ArrayList<String>> result = new Hashtable<>();
//        for(String s: phone_book){
//            if(result.get(s.substring(0,minLength))==null){
//                ArrayList<String> temp = new ArrayList<>();
//                temp.add(s);
//                result.put(s.substring(0,minLength),temp);
//            }else{
//                ArrayList<String> temp = result.get(s.substring(0,minLength));
//                temp.add(s);
//                result.put(s.substring(0,minLength),temp);
//            }
//        }
//
//        return result;
//    }

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