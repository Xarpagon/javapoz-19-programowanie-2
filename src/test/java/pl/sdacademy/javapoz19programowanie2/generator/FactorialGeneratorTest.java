package pl.sdacademy.javapoz19programowanie2.generator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FactorialGeneratorTest {

    private Generator generator;

    @Before
    public void setUp() {
        generator = new FactorialGenerator();
    }

    @Test
    public void next_shouldReturn120At5thCall() {
        //given
        final int attempts = 5;
        final BigDecimal expectedResult = new BigDecimal(120);

        //when
        BigDecimal result = null;
        for(int i = 1; i <= attempts; i++){
            result = generator.next();
            System.out.println(result);
        }

        //then
        Assert.assertNotNull(result);
        Assert.assertEquals(expectedResult, result);
    }
}