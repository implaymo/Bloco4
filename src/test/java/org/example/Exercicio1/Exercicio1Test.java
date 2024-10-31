package org.example.Exercicio1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {

    @Test
    void test_constructor() {
        new Exercicio1();
    }

    @Test
    void should_return_6() {
        // arrange
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        // act
        int result = Exercicio1.exercicio1(numbersList);
        // assert
        assertEquals(6, result);
    }

    @Test
    void should_return_0() {
        // arrange
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(-1);
        numbersList.add(-2);
        numbersList.add(3);
        // act
        int result = Exercicio1.exercicio1(numbersList);
        // assert
        assertEquals(0, result);
    }

    @Test
    void should_return_1() {
        // arrange
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(0);
        numbersList.add(0);
        numbersList.add(1);
        // act
        int result = Exercicio1.exercicio1(numbersList);
        // assert
        assertEquals(1, result);
    }

}