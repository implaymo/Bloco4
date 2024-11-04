package org.example.Exercicio1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {

    @Test
    void test_constructor() {
        new Exercicio1();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_valid(int[] numbersList, int expected) {
        // arrange
        // act
        int result = Exercicio1.exercicio1(numbersList);
        // assert
        assertEquals(expected, result);
    }

    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{-1, -2, 3}, 0),
                Arguments.of(new int[]{0, 0, 1}, 1)

        );
    }

}