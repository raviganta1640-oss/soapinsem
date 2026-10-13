package com.example.shipping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shippingcontroller {
      @GetMapping("/shipping")
      public String solution() {
    	  return "Welcome to Shipping Service";
      }
}
