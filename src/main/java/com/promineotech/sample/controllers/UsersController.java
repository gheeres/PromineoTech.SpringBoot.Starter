package com.promineotech.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.sample.models.UserModel;
import com.promineotech.sample.repositories.UserRepository;

@RestController
public class UsersController {
  private UserRepository repository;
  
  public UsersController(UserRepository repository) {
    this.repository = repository;
  }
  
  @GetMapping(value = "/users")
  public UserModel[] all() {
    return repository.all();
  }
  
  @GetMapping(value = "/users/{id}")
  public UserModel get(@PathVariable String id) {
    return repository.get(id);
  }
}
