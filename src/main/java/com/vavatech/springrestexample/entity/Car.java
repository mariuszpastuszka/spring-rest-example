package com.vavatech.springrestexample.entity;

import lombok.Builder;

import java.time.YearMonth;


@Builder
public record Car(
        Long id,
        String brand,
        String model,
        YearMonth yearMonthProduction,
        long mileage
) {
}
