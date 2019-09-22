package pl.sdacademy.javapoz19programowanie2.fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursive implements Fibonacci {

    @Override
    public BigDecimal getN(int n) {

        validateArgument(n);

        if (n == 0) {
            return new BigDecimal(0);
        } else  if (n == 1) {
            return new BigDecimal(1);
        } else {
            return getN(n-1).add(getN(n - 2));
        }
    }
}
