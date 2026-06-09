package com.pluralsight.sneakersdrops;


import com.pluralsight.sneakersdrops.service.DropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {
    private final DropService runner;

    @Autowired
    public StartupRunner(DropService runner) {
        this.runner = runner;
    }

    public void run(String... args) throws Exception {
        System.out.println(this.runner.getStatus());
    }
}
