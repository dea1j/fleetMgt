package com.dea1j.fleetMgt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/clients")
    public String getClients() {
        return "client";
    }
}
