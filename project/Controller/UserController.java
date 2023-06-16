package project.Controller;

import project.DAOuser.UserInfo;

public class UserController {
    public boolean UserLogin(UserInfo uin){
        
        if(uin.getEmail().equals("admin@gmail.com")&& uin.getPassword().equals("admin123")){
            return true;
        }
        return false;

    }
}
