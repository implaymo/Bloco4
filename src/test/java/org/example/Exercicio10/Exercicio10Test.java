package org.example.Exercicio10;

import org.example.Exercicio11.Exercicio11;
import org.example.Exercicio9.Exercicio9;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio10Test {

    @Test
    void test_constructor() {
        new Exercicio10();
    }

    @ParameterizedTest
    @MethodSource("allTests")
    void should_return_all_of_odd_numbers(int[] numbersList, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio10.exercicio10(numbersList);
        // assert
        assertEquals(expected, result);
    }

    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTests() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5,6}, new ArrayList<>(Arrays.asList(1, 3, 5))),
                Arguments.of(new int[]{}, new ArrayList<>(Arrays.asList())),
                Arguments.of(new int[]{2, 2, 2}, new ArrayList<>(Arrays.asList()))
        );
    }
}