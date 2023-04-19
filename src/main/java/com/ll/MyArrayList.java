package com.ll;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10; //배열의 기본 용량
    private static final Object[] EMPTY_DATA = {};  //빈 배열
    private int size; //data 배열의 크기를 나타내는 변수
    Object[] data;  //새로운 자료를 담을 배열

    public int size() {
        return size;
    }

    public boolean add(E element) {
        size++;
        return true;
    }

//    public MyArrayList(){
//        data = new Object[DEFAULT_CAPACITY]; //디폴트 용량으로 초기화
//    }
}