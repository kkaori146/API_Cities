package com.github.kkaori146.citiesapi.repository;

import com.github.kkaori146.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
