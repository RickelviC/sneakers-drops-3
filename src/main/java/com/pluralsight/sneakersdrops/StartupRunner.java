package com.pluralsight.sneakersdrops;


import com.pluralsight.sneakersdrops.data.BrandRepository;
import com.pluralsight.sneakersdrops.models.Brand;
import com.pluralsight.sneakersdrops.service.DropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {
    private final BrandRepository brandRepository;
    private final DropService runner;

    @Autowired
    public StartupRunner(BrandRepository brandRepository, DropService runner) {
        this.brandRepository = brandRepository;
        this.runner = runner;
    }

    public void run(String... args) throws Exception {
        seedDate();
        for (Brand brand : brandRepository.findAll()) {
            System.out.println(brand.getId() + " - " + brand.getName());
        }
        System.out.println(this.runner.getStatus());
    }

    private void seedDate() {
        if (brandRepository.count() == 0) {
            brandRepository.save(new Brand("Nike"));
            brandRepository.save(new Brand("Adidas"));
            brandRepository.save(new Brand("New Balance"));
            brandRepository.save(new Brand("Puma"));
            brandRepository.save(new Brand("ReeBok"));
        }
    }
}
