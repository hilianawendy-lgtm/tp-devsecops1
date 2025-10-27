package com.example.democyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example.democyber") // <- ici !
public class DemocyberApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemocyberApplication.class, args);
    }

    // Optionnel : pour vérifier les beans chargés
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("---- Liste des beans Spring Boot chargés ----");
            String[] beanNames = ctx.getBeanDefinitionNames();
            java.util.Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
            System.out.println("---- Fin de la liste ----");
        };
    }
}
