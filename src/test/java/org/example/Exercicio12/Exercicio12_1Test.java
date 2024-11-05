package org.example.Exercicio12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_1Test {

    @Test
    void test_constructor() {
        new Exercicio12_1();
    }

    @ParameterizedTest
    @MethodSource("allTest")
    void should_return_the_lowest_value(int[] arrayInput, int expected) {
        // arrange
        // act
        int result = Exercicio12_1.exercicio12_1(arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTest() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, 1),
                Arguments.of(new int[]{2, 3, 4}, 2),
                Arguments.of(new int[]{0, 6}, 0),
                Arguments.of(new int[]{-1, -2, 3}, -2),
                Arguments.of(new int[]{}, 0)

        );
    }
}