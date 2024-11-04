package org.example.Exercicio3;

import org.example.Exercicio2.Exercicio2;
import org.example.Exercicio7.Exercicio7;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio3Test {

    @Test
    void test_constructor() {
        new Exercicio3();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_array_index_were_accumulated_product_is_bigger_than_user_input_number(int[] numbers,
                                                                                             int userInput,
                                                                                             int expected) {
        // arrange
        // act
        int result = Exercicio3.exercicio3(numbers, userInput);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 10, 3),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 0, 0),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 1000, -1)
        );}
}