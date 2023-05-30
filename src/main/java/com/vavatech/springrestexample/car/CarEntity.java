package com.vavatech.springrestexample.car;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.YearMonth;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CarEntity {
    @Id
    Long id;
    String brand;
    String model;
    YearMonth yearMonthProduction;
    Long mileage;
}
