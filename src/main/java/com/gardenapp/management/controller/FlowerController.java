package com.gardenapp.management.controller;

import com.gardenapp.management.MainApplication;
import com.gardenapp.management.domain.Flower;
import com.gardenapp.management.domain.Garden;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class FlowerController {

    @GetMapping("/flowers")
    public String showFlowersList(Model model, @RequestParam int garden) {
        model.addAttribute("flowers", MainApplication.gardens.get(garden).getFlowers());
        model.addAttribute("garden", garden);
        return "flowers/list";

    }

    @RequestMapping("/newFlower")
    public String newFlower(Model model, @RequestParam int garden) {
        model.addAttribute("flower", new Flower());
        model.addAttribute("garden", garden);
        return "flowers/form";
    }

    @PostMapping("/addFlower")
    public String addFlower(Model model, @Valid @ModelAttribute Flower flower, BindingResult result, @RequestParam int garden) {
        if (result.hasErrors())
        {
            model.addAttribute("flowers", MainApplication.gardens.get(garden).getFlowers());
            model.addAttribute("garden", garden);
            return "flowers/form";
        }
        else {
            MainApplication.gardens.get(garden).getFlowers().add(flower);
            return "redirect:/gardens";
        }

    }


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(new FlowerValidator());
    }

}
