package pl.sdacademy.javapoz19programowanie2.factorial;


import java.math.BigDecimal;

public interface Factorial {
    BigDecimal getN(int n);

    default void validateArgument(int n) {
        if (n < 0) {
            throw new FactorialArgumentException("Argument nie może być mniejszy od 0.");
        }
    }
}
