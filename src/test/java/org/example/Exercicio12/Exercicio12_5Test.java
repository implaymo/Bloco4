package org.example.Exercicio12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_5Test {

    @Test
    void exercicio12_5() {
        new Exercicio12_5();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_not_repeated_numbers(int[] arrayInput, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio12_5.exercicio12_5(arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 3}, new ArrayList<>(List.of(1, 2))),
                Arguments.of(new int[]{2, 3, 4}, new ArrayList<>(List.of(2, 3, 4))),
                Arguments.of(new int[]{5, 6, 6, 6}, new ArrayList<>(List.of(5))),
                Arguments.of(new int[]{0, 0, 6}, new ArrayList<>(List.of(6))),
                Arguments.of(new int[]{-1, -2, 3, 4}, new ArrayList<>(List.of(-1, -2, 3, 4)))
        );
    }
}