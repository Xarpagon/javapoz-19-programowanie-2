package pl.sdacademy.javapoz19programowanie2.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciFactoryTest {
    private FibonacciFactory factory = new FibonacciFactory();

    @Test
    public void shouldProduceIterational() {
        //given
        final AlgorithmType type = AlgorithmType.ITERATIONAL;
        //when
        Fibonacci result = factory.produce(type);
        //then
        assertTrue(result instanceof Fibonacci);
        assertTrue(result instanceof FibonacciIterational);
        assertFalse(result instanceof FibonacciRecursive);
    }

    @Test
    public void shouldProduceRecursive() {
        //given
        final AlgorithmType type = AlgorithmType.RECURSIVE;
        //when
        Fibonacci result = factory.produce(type);
        //then
        assertTrue(result instanceof Fibonacci);
        assertFalse(result instanceof FibonacciIterational);
        assertTrue(result instanceof FibonacciRecursive);
    }
}