package com.kyle.elasticsearchpractice.persistence;

import com.kyle.elasticsearchpractice.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
