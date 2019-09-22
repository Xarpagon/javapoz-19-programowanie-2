package pl.sdacademy.javapoz19programowanie2.factorial;

public class FactorialFactory {

    public Factorial produce(FactorialAlgorithmType type) {
        if(FactorialAlgorithmType.RECURSIVE.equals(type)) {
            return new FactorialRecursive();
        }
        if(FactorialAlgorithmType.ITERATIONAL.equals(type)) {
            return new FactorialIterational();
        }
        return null;
    }
}
