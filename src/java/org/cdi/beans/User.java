/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cdi.beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
/**
 *
 * @author Mobile Apps
 */

@Named
@ApplicationScoped
public class User {
    
    private String username;
    private String userpassword;
    private String gender;
    private String email;
    
    
    public User(){};
    
    public User(String username,String userpassword,String email){
        this.username=username;
        this.userpassword=userpassword;
        this.email=email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
