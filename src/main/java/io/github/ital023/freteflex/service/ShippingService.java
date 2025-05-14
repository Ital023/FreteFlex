package io.github.ital023.freteflex.service;

import io.github.ital023.freteflex.domain.ExpressShippingCalculator;
import io.github.ital023.freteflex.domain.StandartShippingCalculator;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private final StandartShippingCalculator standartShippingCalculator;

    private final ExpressShippingCalculator expressShippingCalculator;

    public ShippingService(StandartShippingCalculator standartShippingCalculator,
                           ExpressShippingCalculator expressShippingCalculator) {
        this.standartShippingCalculator = standartShippingCalculator;
        this.expressShippingCalculator = expressShippingCalculator;
    }

    public Double calculate(String shippingType,
                            Double distance,
                            Double weight){

        if (shippingType.equalsIgnoreCase("standart")) {
            return standartShippingCalculator.calculate(distance, weight);
        } else if (shippingType.equalsIgnoreCase("express")) {
            return expressShippingCalculator.calculate(distance, weight);
        }

        return 0.0;
    }

}
