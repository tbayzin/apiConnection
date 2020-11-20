package com.example.apiConnection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping ("/ozgurproject")
public class PostController {

      boolean isEven;d

         Random number = new Random();
        int number1 = number.nextInt(10);

      @RequestMapping(value = "/api", method = RequestMethod.POST)
@ResponseBody
    public boolean getResult (int number, String name) {

        if (number %2 ==0 ) {
            isEven = true;

        }

        else {
            isEven = false;
        }

        return isEven;
    }

}
