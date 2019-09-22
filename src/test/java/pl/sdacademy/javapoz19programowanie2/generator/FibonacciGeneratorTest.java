package pl.sdacademy.javapoz19programowanie2.generator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciGeneratorTest {

    private Generator generator;

    @Before
    public void setUp() {
        generator = new FibonacciGenerator();
    }

    @Test
    public void next_shouldReturn8At6thCall() {
        //given
        final int attempts = 6;
        final BigDecimal expectedResult = new BigDecimal(8);

        //when
        BigDecimal result = null;
        for(int i = 0; i <= attempts; i++){
            result = generator.next();
            System.out.println(result);
        }

        //then
        Assert.assertNotNull(result);
        Assert.assertEquals(expectedResult, result);
    }
}