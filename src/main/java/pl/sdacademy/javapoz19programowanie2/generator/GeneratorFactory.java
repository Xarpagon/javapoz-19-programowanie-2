package pl.sdacademy.javapoz19programowanie2.generator;

public class GeneratorFactory {
    public Generator produce(GeneratorAlgorithmType type) {
        if(GeneratorAlgorithmType.FACTORIAL.equals(type)) {
            return new FactorialGenerator();
        }
        if(GeneratorAlgorithmType.FIBONACCI.equals(type)) {
            return new FibonacciGenerator();
        }
        return null;
    }
}
