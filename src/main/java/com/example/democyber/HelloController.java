package com.example.democyber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Faux secret pour tester Gitleaks (TP3)
    String testSecret = "ghp_FAKESECRET1234567890000000000000000";

    @GetMapping("/")
    public String home() {
        return "Bonjour depuis democyber !";
    }
}
