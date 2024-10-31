package org.example.Exercicio3;

import org.example.Exercicio2.Exercicio2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio3Test {

    @Test
    void test_constructor() {
        new Exercicio3();
    }

    @Test
    void should_return_2(){
        // arrange
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        // act
        int result = Exercicio3.exercicio3(numbers, 10);
        // assert
        assertEquals(2, result);
    }
}