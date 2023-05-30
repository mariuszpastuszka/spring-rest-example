package com.vavatech.springrestexample.car;

import lombok.Builder;

import java.time.YearMonth;


@Builder
record Car(
        Long id,
        String brand,
        String model,
        YearMonth yearMonthProduction,
        long mileage
) {
}
