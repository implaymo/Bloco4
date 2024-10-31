package org.example.Exercicio8;

import org.example.Exercicio12.Exercicio12_3;
import org.example.Exercicio7.Exercicio7;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio8Test {

    @Test
    void test_constructor() {
        new Exercicio8();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_a_valid_sum(int start, int end,int[] arrayInput, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio8.exercicio8(start, end, arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(4, 12, new int[]{2, 3}, new ArrayList<>(List.of(6, 12))),
                Arguments.of(4, 10, new int[]{2, 3}, new ArrayList<>(List.of(6))),
                Arguments.of(1, 20, new int[]{2, 3}, new ArrayList<>(List.of(6, 12, 18)))
        );
    }
}