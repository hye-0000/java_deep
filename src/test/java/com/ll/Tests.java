package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    //private MyArrayList<String> list;

    @Test
    @DisplayName("testSize")
    void test01(){
        MyArrayList<String> list = new MyArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    @DisplayName("testAdd")
    void test02(){
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("get(1)")
    void test03(){
        MyArrayList<String> list = new MyArrayList<>();

        list.add("사과");
        list.add("포도");

        assertThat(list.get(1)).isEqualTo("포도");
    }
}
