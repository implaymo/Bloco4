package org.example.Exercicio12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_4Test {

    @Test
    void test_constructor() {
        new Exercicio12_4();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_a_valid_product(int[] arrayInput, int expected) {
        // arrange
        // act
        int result = Exercicio12_4.exercicio12_4(arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{2, 3, 4}, 24),
                Arguments.of(new int[]{5, 6}, 30),
                Arguments.of(new int[]{0, 6}, 0),
                Arguments.of(new int[]{-1, -2, 3}, 6)
        );
    }
}