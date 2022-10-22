package com.example.springapp;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class FirstController {
    private int count = 0;

    @RequestMapping("/")
    public String hello() {
        return "================================================Hello World!============================================";
    }

    @RequestMapping("/rolldice")
    private String throwDice() {
        Random rand = new Random();
        int randomNumber = (rand.nextInt(6)) + 1;
        return "Jūs uzmetāt: " + randomNumber;
    }

    @RequestMapping("/person")
    private Person createPerson() {
        return new Person("John", "Smith", "213455-63634");
        //Displays Person how it's defined in .toString method in Person class
    }

    @RequestMapping("/count")
    private String count() {
        count++;
        return "This page was accessed: " + count + " times";
    }

    @RequestMapping("/multiply")
    private @ResponseBody int multiply(@RequestParam int base) {
        return base * 10;
    }
}