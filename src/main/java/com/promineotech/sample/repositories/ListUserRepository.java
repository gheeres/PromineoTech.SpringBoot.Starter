package com.promineotech.sample.repositories;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.promineotech.sample.models.UserModel;

@Repository
public class ListUserRepository implements UserRepository {
  private ArrayList<UserModel> users = new ArrayList<UserModel>();

  public ListUserRepository()
  {
    users.add(new UserModel("gheeres", "George Heeres"));
    users.add(new UserModel("asmith", "Andrew Smith"));
    users.add(new UserModel("tbrown", "Tom Brown"));
  }
  
  @Override
  public UserModel getUser(String id) {
    //for(UserModel user: users) {
    //  if (user.getId().equalsIgnoreCase(id)) {
    //    return user;
    //  }
    //}
    //return null;
    return users.stream().filter((u) -> id.equalsIgnoreCase(u.getId()))
                         .findFirst()
                         .orElse(null); 
  }

  @Override
  public UserModel[] allUsers() {
    return (UserModel[]) users.toArray(new UserModel[0]);
  }

}
