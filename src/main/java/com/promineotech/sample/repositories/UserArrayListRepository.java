package com.promineotech.sample.repositories;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.promineotech.sample.models.UserModel;

@Repository
public class UserArrayListRepository implements UserRepository {
  private ArrayList<UserModel> users = new ArrayList<UserModel>();
  
  public UserArrayListRepository() {
    // populate users
    users.add(new UserModel("carrasco", "Edgar Carrasco"));
    users.add(new UserModel("alvarez", "Juan Alvarez"));
    users.add(new UserModel("akbik", "Keith Akbik"));
    users.add(new UserModel("gheeres", "George Heeres"));
  }
  
  @Override
  public UserModel[] all() {
    return (UserModel[]) users.toArray(new UserModel[0]);
  }

  @Override
  public UserModel get(String id) {
    //  for(UserModel user: users) {
    //    if (user.getId().equalsIgnoreCase(id)) {
    //      return user;
    //    }
    //  }
    // return null;

    return users.stream()
                .filter((user) -> user.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElse(null);
  }

}
