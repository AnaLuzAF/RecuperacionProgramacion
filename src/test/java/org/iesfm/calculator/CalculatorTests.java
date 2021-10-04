package org.iesfm.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CalculatorTests {

    @Test
    public void sumaTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5);

        int res = Calculator.suma(numbers);

        Assert.assertEquals(12, res);
    }
}
