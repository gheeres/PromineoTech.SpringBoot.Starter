package com.promineotech.sample.controllers;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberGeneratorController {
  private static Random random = new Random();
  private static final int DEFAULT_MAX_RANDOM_VALUE = 9999999;
  
  // C - Create  => POST
  // R - Read    => GET
  // U - Update  => PUT
  // D - Delete  => DELETE
  @RequestMapping(value = "/random", method = RequestMethod.GET)
  public int getRandom() {
    return getRandomUpToMax(DEFAULT_MAX_RANDOM_VALUE);
  }
  
  @GetMapping(value = "/random/{max}")
  public int getRandomUpToMax(@PathVariable int max) {
    return random.nextInt(max);  
  }
  
//  @GetMapping(value = "/random/25")  
//  public int getRandomUpTo25() {
//    return random.nextInt(25);
//  }
//
//  @GetMapping(value = "/random/100")  
//  public int getRandomUpTo100() {
//    return random.nextInt(100);
//  }
}
