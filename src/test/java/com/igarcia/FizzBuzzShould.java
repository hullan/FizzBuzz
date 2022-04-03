package com.igarcia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzShould {
    @Test
    public void convert_1_to_1() {
        assertEquals("1", new FizzBuzz().convert(1));
    }

    @Test
    public void convert_2_to_2() {
        assertEquals("2", new FizzBuzz().convert(2));
    }

    @Test
    public void convert_4_to_4() {
        assertEquals("4", new FizzBuzz().convert(4));
    }

    @ParameterizedTest
    @CsvSource({ "1,1", "2,2", "4,4" })
    public void convert_number_to_FizzBuzz_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @Test
    public void convert_3_to_Fizz() {
        assertEquals("Fizz", new FizzBuzz().convert(3));
    }

    @ParameterizedTest
    @CsvSource({ "3,Fizz", "6,Fizz", "9,Fizz" })
    public void convert_number_to_FizzBuzz_string_Fizz(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @Test
    public void convert_5_to_Buzz() {
        assertEquals("Buzz", new FizzBuzz().convert(5));
    }

    @ParameterizedTest
    @CsvSource({ "5,Buzz", "10,Buzz", "20,Buzz" })
    public void convert_number_to_FizzBuzz_string_Buzz(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @Test
    public void convert_15_to_FizzBuzz() {
        assertEquals("FizzBuzz", new FizzBuzz().convert(15));
    }

    @ParameterizedTest
    @CsvSource({ "15,FizzBuzz", "30,FizzBuzz", "45,FizzBuzz" })
    public void convert_number_to_FizzBuzz_string_FizzBuzz(int input, String expectedOutput) {
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

}
