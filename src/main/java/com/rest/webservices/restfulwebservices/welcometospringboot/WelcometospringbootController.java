package com.rest.webservices.restfulwebservices.welcometospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcometospringbootController {
        @GetMapping(path = "/Welcome-to-springboot")
        public String WelcomeToSpringBoot() {
            return "Welcome to spring boot";
        }
            @GetMapping(path = "/Welcome-to-springboot-bean")
            public WelcometospringbootControllerbean WelcomeToSpringBootBean(){
                return new WelcometospringbootControllerbean("Welcome to spring boot");
    }
}
