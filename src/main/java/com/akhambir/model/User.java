package com.akhambir.model;

public class User {
    private String userName;
    private String password;
    private String email;
    private String token;

    public User(String userName, String password, String email, String token) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.token = token;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
