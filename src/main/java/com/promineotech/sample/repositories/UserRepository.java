package com.promineotech.sample.repositories;

import com.promineotech.sample.models.UserModel;

public interface UserRepository {
  /**
   * Gets the user with the specified unique id.
   * @param id The unique id of the person
   * @return The user if found, otherwise null.
   */
  UserModel getUser(String id);
  
  /**
   * Retrieves all available users.
   * @return All users. An empty list if no users are availabe.
   */
  UserModel[] allUsers();
}
