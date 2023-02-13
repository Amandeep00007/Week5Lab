/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author amand
 */
public class AccountService {
    public AccountService(){
        
    }
    public User login(String username, String password){
        String nameOne = "aba";
        String nameTwo = "barb";
        String passwordOne = "password";
        
        if(username.equals(nameOne) || username.equals(nameTwo) && password.equals(passwordOne)){
            
           User user = new User(username, password);
           user.setPassword(null);
           return user;
           
       }else{
           return null;
         }
        
    }
}


