package org.example.Exercicio12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_3Test {

    @Test
    void test_constructor() {
        new Exercicio12_3();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_a_valid_sum(int[] arrayInput, int expected) {
        // arrange
        // act
        int result = Exercicio12_3.exercicio12_3(arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{2, 3, 4}, 9),
                Arguments.of(new int[]{5, 6}, 11)
        );
    }
}