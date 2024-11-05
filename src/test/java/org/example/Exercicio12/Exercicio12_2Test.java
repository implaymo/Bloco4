package org.example.Exercicio12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_2Test {

    @Test
    void test_constructor() {
        new Exercicio12_2();
    }

    @Test
    void should_return_the_lowest_value(){
        // arrange
        int[] numbers = {1,2,3,4,5};
        // act
        int result = Exercicio12_2.exercicio12_2(numbers);
        // assert
        assertEquals(5, result);
    }

    @Test
    void should_return_the_lowest_value2(){
        // arrange
        int[] numbers = {5,4,3,2,1};
        // act
        int result = Exercicio12_2.exercicio12_2(numbers);
        // assert
        assertEquals(5, result);
    }

    @ParameterizedTest
    @MethodSource("allTest")
    void should_return_the_highest_value(int[] arrayInput, int expected) {
        // arrange
        // act
        int result = Exercicio12_2.exercicio12_2(arrayInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTest() {
        return Stream.of(
                Arguments.of(new int[]{5,2,1,3,4}, 5),
                Arguments.of(new int[]{2, 3, 4}, 4),
                Arguments.of(new int[]{0, 6}, 6),
                Arguments.of(new int[]{-10, 1, -2}, 1),
                Arguments.of(new int[]{}, 0)
        );
    }
}