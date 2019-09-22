package pl.sdacademy.javapoz19programowanie2.factorial;

import java.math.BigDecimal;

public class FactorialRecursive implements Factorial {
    @Override
    public BigDecimal getN(int n) {
        validateArgument(n);

        if (n == 0) {
            return new BigDecimal(1);
        } else {
            return getN(n - 1).multiply(new BigDecimal(n));
        }
    }
}
