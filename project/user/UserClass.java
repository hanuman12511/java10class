package project.user;

import java.util.Scanner;

import project.Controller.UserController;
import project.DAOuser.UserInfo;

public class UserClass {
  UserInfo uin =new UserInfo();
  Scanner sc=new Scanner(System.in);
  UserController ucon=new UserController();
  public  UserClass(){
    System.out.println("Enter name,email,password");
      uin.setName(sc.next());
      uin.setEmail(sc.next());
      uin.setPassword(sc.next());
      if(ucon.UserLogin(uin)){
        System.out.print("user Login");
      }
      else{
      System.out.print("user  not Login");
        
      }
    }
    
}
