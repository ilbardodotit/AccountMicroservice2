package com.quicktutorials.learnmicroservices.AccountMicroservice.controllers;

import com.quicktutorials.learnmicroservices.AccountMicroservice.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.BindingResult;


import javax.validation.Valid;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/hello")
    public String sayHello(){

        return "Hello clochard e benvenuti in una nuova trasmissione";
    }

    @RequestMapping("/newuser1")
    public String addUser(User user){

        return "Il clochard " + user.getUsername() + " è stato registrato corettamente.  Il suo id è " + user.getId();
    }

    @RequestMapping("/newuser2")
    public String addUserValid(@Valid User user){

        return "Hellò clochard " + user.getUsername() + " sei stato registrato corettamente.  Il tuo id è " + user.getId();
    }

    @RequestMapping("/newuser3")
    public String addUserValidPlusBinding(@Valid User user, BindingResult result){

        if(result.hasErrors()) {
            return result.toString();
        }
        return "Il clochard " + user.getUsername() + " è stato registrato corettamente.  Il suo id è " + user.getId();
    }

}
