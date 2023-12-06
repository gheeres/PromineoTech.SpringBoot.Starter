package com.promineotech.sample.models;

public class UserModel {
  private String id;
  private String name;
  
  public UserModel() {
  }
  
  public UserModel(String id, String name) {
    this();
    
    this.id = id;
    this.name = name;
  }
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
