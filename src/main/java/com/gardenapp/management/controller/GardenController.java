package com.gardenapp.management.controller;

import com.gardenapp.management.MainApplication;
import com.gardenapp.management.domain.Garden;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
public class GardenController {

    @GetMapping("/gardens")
    public String showList(Model model) {
        model.addAttribute("gardens", MainApplication.gardens);
        return "gardens/list";
    }

    @RequestMapping("/newGarden")
    public String newGardenForm(Model model) {
        model.addAttribute("garden", new Garden());
        return "gardens/form";
    }

    @PostMapping("/addGarden")
    public String addGardenToList(Model model, @Valid @ModelAttribute Garden garden, BindingResult result) { //@valid denotes a variable that can be validated
                                                                                                             //@ModelAttribute denotes a predefined module attribute or object that exists already that we will use
        // let's check if there are errors first
        if (result.hasErrors()) {
            model.addAttribute("gardens", MainApplication.gardens); // lets the form access the errors
            return "gardens/form"; // refresh page with errors
        }
        else {

            MainApplication.gardens.add(garden); //adds the module attribute garden to the list
            return "redirect:/gardens";
        }
    }




    // binds the validator to the controller
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new GardenValidator());
    }


}
