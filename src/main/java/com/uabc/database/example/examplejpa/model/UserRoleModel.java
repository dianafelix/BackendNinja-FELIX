package com.uabc.database.example.examplejpa.model;
import com.uabc.database.example.examplejpa.entity.User;

public class UserRoleModel {
    private int id;
    private User user;
    private String role;

    public UserRoleModel(){

    }


    public UserRoleModel(int id, User user, String role) {
        this.id = id;
        this.user = user;
        this.role = role;
    }
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }


    @Override
    public String toString() {
        return "UserRoleModel{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
