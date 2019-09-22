package pl.sdacademy.javapoz19programowanie2.generator;

import java.math.BigDecimal;

public class FactorialGenerator implements Generator {

    private BigDecimal current = new BigDecimal(1);
    private int i = 1;

    @Override
    public BigDecimal next() {
        current = current.multiply(new BigDecimal(i++));
        return current;
    }
}
