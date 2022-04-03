package com.igarcia;

public class FizzBuzz {
    public String convert(int number) {
        String result = "";
        if (number % 3 == 0)
            result += "Fizz";
        if (number % 5 == 0)
            result += "Buzz";
        if (result.length() == 0)
            result = String.valueOf(number);
        return result;
    }
}
