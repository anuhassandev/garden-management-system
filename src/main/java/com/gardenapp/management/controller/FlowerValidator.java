package com.gardenapp.management.controller;

import com.gardenapp.management.MainApplication;
import com.gardenapp.management.domain.Flower;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Objects;

public class FlowerValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Flower.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Flower flower = (Flower)target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Flower needs a name!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "", "Flower needs a country!");


        if ( !Objects.equals(flower.getPetals(), "Pink") && !Objects.equals(flower.getPetals(), "pink") && !Objects.equals(flower.getPetals(), "Orange") && !Objects.equals(flower.getPetals(), "orange") && !Objects.equals(flower.getPetals(), "Red") && !Objects.equals(flower.getPetals(), "red") == true) {
            errors.rejectValue("petals", "", "Petals must be Pink, Orange, or Red");

        }

        if (flower.getVarieties() < 1 || flower.getVarieties() > 30) {
            errors.rejectValue("varieties", "", "Varieties must be between 1 and 30!");

        }

    }
}
