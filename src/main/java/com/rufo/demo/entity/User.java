package com.rufo.demo.entity;

public class User {

    private Long ID;
    private String user_login;
    private String user_pass;

    public User(Long ID, String user_login, String user_pass) {
        this.ID = ID;
        this.user_login = user_login;
        this.user_pass = user_pass;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}
