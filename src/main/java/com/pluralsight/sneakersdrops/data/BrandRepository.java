package com.pluralsight.sneakersdrops.data;

import com.pluralsight.sneakersdrops.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
