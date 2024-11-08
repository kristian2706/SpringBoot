package com.springbootproject.springbootproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Füge dies hinzu, um den Controller zu markieren
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello World");
        return "home"; // verweist auf home.html
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("info", "Dies ist eine Beispiel Seite über uns.");
        return "about";
    }
}
