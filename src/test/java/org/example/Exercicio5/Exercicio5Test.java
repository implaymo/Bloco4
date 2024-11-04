package org.example.Exercicio5;

import org.example.Exercicio4.Exercicio4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio5Test {

    @Test
    void test_constructor() {
        new Exercicio5();
    }

    @ParameterizedTest
    @MethodSource("allTests")
    void should_return_numbers_till_index_equals_user_input(int[] numbers, int userInput, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio5.exercicio5(numbers, userInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTests() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 6, 8, 1, 23, 89, 12} , 4,
                        new ArrayList<>(Arrays.asList(3, 4, 6, 8))),
                Arguments.of(new int[]{3, 4, 6, 8, 1, 23, 89, 12} , 0,
                        new ArrayList<>(Arrays.asList()))
        );
    }
}