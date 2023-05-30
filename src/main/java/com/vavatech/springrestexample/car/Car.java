package com.vavatech.springrestexample.car;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.time.YearMonth;


@Builder
record Car(
        Long id,
        @Size(min = 3, max = 20)
        String brand,
        String model,
        @Past
        YearMonth yearMonthProduction,
        Long mileage
) {
}
