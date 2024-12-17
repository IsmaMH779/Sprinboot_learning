package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: captain.name and pirates.name

    @Value("${captain.name}")
    private String captainName;

    @Value("${pirates.name}")
    private String piratesName;

    // expose new endpoint for "pirateinfo"

    @GetMapping("/pirateinfo")
    public String getPirateInfo() {
        return "Captain: " + captainName + ", Pirates name: " + piratesName;
    }

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

}






