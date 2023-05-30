package com.vavatech.springrestexample.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity, Long> {

    // custom methods
    List<CarEntity> findAllByBrandAndModel(String brand, String model);

    @Query("""
           SELECT e from CarEntity e
        """)
    List<CarEntity> findCarsByCustomQuery();

    @Query(value = """
           SELECT * from CarEntity
        """, nativeQuery = true)
    List<CarEntity> findCarsByCustomQueryNativeQuery();
}
