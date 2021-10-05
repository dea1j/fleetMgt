package com.dea1j.fleetMgt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
    @GetMapping("/countries")
    public String getCountries(Model model) {
        model.addAttribute("dfd");
        return "country";
    }
}
