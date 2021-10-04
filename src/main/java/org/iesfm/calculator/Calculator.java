package org.iesfm.calculator;

import org.iesfm.calculator.exceptions.NotANumberException;

import java.util.List;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }

    public static int suma(List<Integer> numeros) {
        int sum = 0;

        for (int i = 0; i < numeros.size(); i++) {
            sum = sum + numeros.get(i);
        }

        return sum;
    }

    public static double avg(List<Double> numbers) throws NotANumberException {
        if(numbers.isEmpty()) {
            throw new NotANumberException();
        }
        double sum = 0;
        for (double number : numbers) {
            sum = sum + number;
        }

        return sum / numbers.size();
    }
}
