package user;

import data.DataInfo;

public class User {
  
   public User(DataInfo d){
        System.out.println("id="+d.getId());
        System.out.println("name="+d.getName());
    }
}
