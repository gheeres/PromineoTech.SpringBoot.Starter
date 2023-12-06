package com.promineotech.sample.repositories;

import com.promineotech.sample.models.UserModel;

public interface UserRepository {
  /**
   * Returns all users.
   * @return The users in the system. If not, then an empty list is returned.
   */
  UserModel[] all();
  
  /**
   * Retrieves a user by it's unique id.
   * @param id The unique id of the user.
   * @return The user if found, otherwise null.
   */
  UserModel get(String id);
}
