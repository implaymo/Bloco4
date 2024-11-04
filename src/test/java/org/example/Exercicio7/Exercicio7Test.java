package org.example.Exercicio7;

import org.example.Exercicio6.Exercicio6;
import org.example.Exercicio8.Exercicio8;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio7Test {

    @Test
    void test_constructor() {
        new Exercicio7();
    }


    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_multiples_of_number_provided_by_user(int start, int end, int number, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio7.exercicio7(start, end, number);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(4, 10, 3, new ArrayList<>(List.of(6, 9))),
                Arguments.of(-2, 4, 4, new ArrayList<>(List.of(0, 4))),
                Arguments.of(1, 2, 0, new ArrayList<>(List.of()))
        );}
}