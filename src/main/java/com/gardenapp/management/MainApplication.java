package com.gardenapp.management;

import com.gardenapp.management.domain.Flower;
import com.gardenapp.management.domain.Garden;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MainApplication {

    // Initialization for sample gardens and flowers
    public static List<Garden> gardens = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

        // Adding sample garden data
        gardens.add(new Garden());
        gardens.get(0).setId(0);
        gardens.get(0).setAddress("123 Garden Street, Leicester");
        gardens.get(0).setType("Botanical Garden");

        // Adding sample flower data
        Flower columbine = new Flower();
        columbine.setCountry("UK");
        columbine.setName("Columbine");
        columbine.setPetals("Five-petaled");
        columbine.setVarieties(65);

        gardens.get(0).setFlowers(new ArrayList<>());
        gardens.get(0).getFlowers().add(columbine);
    }
}