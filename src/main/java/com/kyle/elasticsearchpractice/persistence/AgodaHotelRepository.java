package com.kyle.elasticsearchpractice.persistence;

import com.kyle.elasticsearchpractice.domain.AgodaHotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgodaHotelRepository extends JpaRepository<AgodaHotel,Long> {
}
