package com.gardenapp.management.controller;

import com.gardenapp.management.MainApplication;
import com.gardenapp.management.domain.Garden;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class GardenValidator implements Validator { // no @ tag implements instead

    @Override
    public boolean supports(Class<?> clazz) {
        return Garden.class.equals(clazz);
    } // allows a class to be validates


    @Override
    public void validate(Object target, Errors errors) { // all things to be validated go in here

        Garden garden = (Garden)target; // casts type garden out target instead of Object and creates a "garden" object to validate

        for(Garden a_garden : MainApplication.gardens) { // loop through the list of gardens
            if(a_garden.getId() == garden.getId()) {
                errors.rejectValue("id", "", "An garden with this ID already exists!");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "", "Garden needs an address");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "type", "", "Garden needs a type");




    }



}
