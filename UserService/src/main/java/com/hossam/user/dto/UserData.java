/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hossam.user.dto;

/**
 *
 * @author Hossam ElDeen
 */
public class UserData {

    private String username;
    private String email;
    private String profilePicture;
    private String password;
    private Integer id;
    private Boolean isAdmin;

    public UserData() {
    }

    public UserData(String username, String email, String profilePicture, String password, Integer id, Boolean isAdmin) {
        this.username = username;
        this.email = email;
        this.profilePicture = profilePicture;
        this.password = password;
        this.id = id;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
