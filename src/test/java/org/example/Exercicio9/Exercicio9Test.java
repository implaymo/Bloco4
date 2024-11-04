package org.example.Exercicio9;

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

class Exercicio9Test {

    @Test
    void test_constructor() {
        new Exercicio9();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_odd_numbers_left_and_even_numbers_right(int[] arrayInput, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio9.exercicio9(arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5,6}, new ArrayList<>(List.of(1 ,3 ,5 ,2 ,4 ,6))),
                Arguments.of(new int[]{}, new ArrayList<>(List.of())),
                Arguments.of(new int[]{1, 2, 3}, new ArrayList<>(List.of(1 ,3 ,2)))
        );
    }
}