package com.ll;

/*
* ArrayList의 특징 -> 가변배열
* 그렇다면? -> 사이즈를 재할당 해주는 메소드 필요
* */

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10; //배열의 기본 용량
    private static final Object[] EMPTY_DATA = {};  //빈 배열
    private int size; //data 배열의 크기를 나타내는 변수
    Object[] data;  //새로운 자료를 담을 배열

    //생성자: 초기화 하지 않은 경우
    public MyArrayList(){
        data = new Object[DEFAULT_CAPACITY]; //디폴트 용량으로 초기화
        size = 0;
    }

    //생성자: 초기화 한 경우
    public MyArrayList(int capacity){
        if(capacity > 0) data = new Object[capacity];
        else if(capacity == 0) data = new Object[DEFAULT_CAPACITY]; //파라미터가 0일 경우 초기화 하지 않은것과 같음
        else if(capacity < 0) throw new RuntimeException(); //음수일때 예외 처리 시키기

        size = 0;
    }

    private void resize(){
        int now_capacity = data.length;     //현재 배열의 크기
        if(now_capacity == size){
            int new_capacity = now_capacity * 2;
            data = Arrays.copyOf(data, new_capacity);
        }
        if(Arrays.equals(data,EMPTY_DATA)) data = new Object[DEFAULT_CAPACITY];     //clear() 같은것 실행했을 때 기본 용량으로 초기화
    }

    public int size() {
        return size;
    }

    public boolean add(T element) {
        resize();   //배열이 꽉 차있다면 배열을 늘려줌

        data[size] = element;
        size++;
        return true;
    }

    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }


    public int indexOf(T element) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(element)) return i;
        }

        return -1;
    }
}