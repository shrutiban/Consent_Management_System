package com.example.consent.bean;

import javax.persistence.*;

@Entity
public class End_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String UID;
    @Column( nullable = false)
    private String User_Role;
    private String User_Type;
    @Column( nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    public End_User(String UID, String user_Role, String user_Type, String username, String email, String password) {
        this.UID = UID;
        User_Role = user_Role;
        User_Type = user_Type;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public End_User() {
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUser_Role() {
        return User_Role;
    }

    public void setUser_Role(String user_Role) {
        User_Role = user_Role;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//Table (UID, User role, role type, username, email, password)
