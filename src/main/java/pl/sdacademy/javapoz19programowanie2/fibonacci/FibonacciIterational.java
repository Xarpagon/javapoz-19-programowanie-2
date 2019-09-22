package pl.sdacademy.javapoz19programowanie2.fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements Fibonacci {

    @Override
    public BigDecimal getN(int n) {
        validateArgument(n);

        BigDecimal result = new BigDecimal(0);

        BigDecimal prev = new BigDecimal(1);
        for(int i = 1; i <= n; i++) {
            BigDecimal tmp = result;
            result  = result.add(prev);
            prev = tmp;
        }
        return result;
    }
}
