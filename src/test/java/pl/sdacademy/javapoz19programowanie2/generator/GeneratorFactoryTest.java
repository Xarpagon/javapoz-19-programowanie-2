package pl.sdacademy.javapoz19programowanie2.generator;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratorFactoryTest {

    private GeneratorFactory factory = new GeneratorFactory();

    @Test
    public void shouldProduceIterational() {
        //given
        final GeneratorAlgorithmType type = GeneratorAlgorithmType.FACTORIAL;
        //when
        Generator result = factory.produce(type);
        //then
        assertTrue(result instanceof Generator);
        assertTrue(result instanceof FactorialGenerator);
        assertFalse(result instanceof FibonacciGenerator);
    }

    @Test
    public void shouldProduceRecursive() {
        //given
        final GeneratorAlgorithmType type = GeneratorAlgorithmType.FIBONACCI;
        //when
        Generator result = factory.produce(type);
        //then
        assertTrue(result instanceof Generator);
        assertFalse(result instanceof FactorialGenerator);
        assertTrue(result instanceof FibonacciGenerator);
    }

}