package pl.sdacademy.javapoz19programowanie2.factorial;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FactorialIterationalTest {

    private Factorial factorial = new FactorialIterational();

    @Test
    public void getN_shouldReturnResultOf5Factorial() {
        //given
        final int n = 5;
        final BigDecimal expectedValue = new BigDecimal(120);

        //when
        BigDecimal result = factorial.getN(n);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void getN_shouldReturnResultOf0Factorial() {
        //given
        final int n = 0;
        final BigDecimal expectedValue = new BigDecimal(1);

        //when
        BigDecimal result = factorial.getN(n);

        //then
        Assert.assertEquals(expectedValue, result);
    }

    @Test(expected = FactorialArgumentException.class)
    public void shouldThrowExceptionWhenNIsNegative() {
        //given
        final int n = -10;

        //when
        BigDecimal result = factorial.getN(n);
    }

}