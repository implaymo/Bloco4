package org.example.Exercicio6;

import org.example.Exercicio5.Exercicio5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio6Test {

    @Test
    void test_constructor() {
        new Exercicio6();
    }

    @Test
    void should_return_array_with_multiples_of_number_3() {
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,9));
        // act
        ArrayList<Integer> result = Exercicio6.exercicio6(4, 10);
        // assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("allTests")
    void should_return_all_numbers_multiple_of_3(int start, int end, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio6.exercicio6(start, end);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTests() {
        return Stream.of(
                Arguments.of(4, 10, new ArrayList<>(Arrays.asList(6, 9))),
                Arguments.of(-4, -10, new ArrayList<>(Arrays.asList(-9, -6))),
                Arguments.of(10, 11, new ArrayList<>(Arrays.asList())),
                Arguments.of(-10, -4, new ArrayList<>(Arrays.asList(-9, -6)))
                );
    }
}