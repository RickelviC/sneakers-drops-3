package com.pluralsight.sneakersdrops.data;

import com.pluralsight.sneakersdrops.models.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
}
