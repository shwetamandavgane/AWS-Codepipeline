package com.aws.codepipelinedemo.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

      @GetMapping("/hello")
      public String displayWelcomeMessage(){
          return "Welcome to the world of AWS and SpringBoot!!";
      }
}