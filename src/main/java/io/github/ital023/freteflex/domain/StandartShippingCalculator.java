package io.github.ital023.freteflex.domain;

import org.springframework.stereotype.Component;

@Component
public class StandartShippingCalculator implements ShippingCalculator {

    @Override
    public Double calculate(Double distance, Double weight) {
        return weight * 1.0 + distance * 0.5;
    }

}
