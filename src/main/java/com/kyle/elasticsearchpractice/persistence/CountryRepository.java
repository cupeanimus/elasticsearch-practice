package com.kyle.elasticsearchpractice.persistence;

import com.kyle.elasticsearchpractice.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
