package pl.sdacademy.javapoz19programowanie2.factorial;

import org.junit.Test;
import pl.sdacademy.javapoz19programowanie2.fibonacci.AlgorithmType;
import pl.sdacademy.javapoz19programowanie2.fibonacci.Fibonacci;
import pl.sdacademy.javapoz19programowanie2.fibonacci.FibonacciIterational;
import pl.sdacademy.javapoz19programowanie2.fibonacci.FibonacciRecursive;

import static org.junit.Assert.*;

public class FactorialFactoryTest
{

    private FactorialFactory factory = new FactorialFactory();

    @Test
    public void shouldProduceIterational() {
        //given
        final FactorialAlgorithmType type = FactorialAlgorithmType.ITERATIONAL;
        //when
        Factorial result = factory.produce(type);
        //then
        assertTrue(result instanceof Factorial);
        assertTrue(result instanceof FactorialIterational);
        assertFalse(result instanceof FactorialRecursive);
    }

    @Test
    public void shouldProduceRecursive() {
        //given
        final FactorialAlgorithmType type = FactorialAlgorithmType.RECURSIVE;
        //when
        Factorial result = factory.produce(type);
        //then
        assertTrue(result instanceof Factorial);
        assertFalse(result instanceof FactorialIterational);
        assertTrue(result instanceof FactorialRecursive);
    }

}