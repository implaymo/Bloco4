package org.example.Exercicio4;

import org.example.Exercicio3.Exercicio3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio4Test {

    @Test
    void test_constructor() {
        new Exercicio4();
    }

    @Test
    void should_return_number_split_into_an_array(){
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // act
        ArrayList<Integer> result = Exercicio4.exercicio4(1234);
        // assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("allTests")
    void should_return_number_split_into_an_array(int userInputNumber, ArrayList<Integer> expected) {
        // arrange
        // act
        ArrayList<Integer> result = Exercicio4.exercicio4(userInputNumber);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTests() {
    return Stream.of(
            Arguments.of(36781, new ArrayList<>(Arrays.asList(3, 6, 7, 8, 1))),
            Arguments.of(30781, new ArrayList<>(Arrays.asList(3, 0, 7, 8, 1))),
            Arguments.of(3, new ArrayList<>(Arrays.asList(3)))
    );
    }
}