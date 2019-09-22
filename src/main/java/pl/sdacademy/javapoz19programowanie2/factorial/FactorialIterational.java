package pl.sdacademy.javapoz19programowanie2.factorial;

import java.math.BigDecimal;

public class FactorialIterational implements Factorial {


    @Override
    public BigDecimal getN(int n) {
        validateArgument(n);

        BigDecimal result = new BigDecimal(1);

        for(int i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));

        }
        return result;
    }
}
