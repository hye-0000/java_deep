package com.ll;

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

    public int size() {
        return size;
    }

    public boolean add(T element) {
        size++;
        return true;
    }

    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }


}