package org.example.Exercicio12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_6Test {

    @Test
    void test_constructor() {
        new Exercicio12_6();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_not_repeated_numbers(int[] arrayInput, int[] expected) {
        // arrange
        // act
        int[] result = Exercicio12_6.exercicio12_6(arrayInput);
        // assert
        assertArrayEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{5, 6, 7}, new int[]{7, 6, 5}),
                Arguments.of(new int[]{2, 3, 4}, new int[]{4, 3, 2}),
                Arguments.of(new int[]{-1, -2, 3, 4}, new int[]{4, 3, -2, -1})
        );
    }
}