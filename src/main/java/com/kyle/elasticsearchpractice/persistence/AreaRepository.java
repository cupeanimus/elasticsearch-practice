package com.kyle.elasticsearchpractice.persistence;

import com.kyle.elasticsearchpractice.domain.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository<Area,Long> {
}
